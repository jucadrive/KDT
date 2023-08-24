package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.example.springboot.dao.ITransaction1Dao;
import com.example.springboot.dao.ITransaction2Dao;

@Service
public class BuyTicketService implements IBuyTicketService {

	@Autowired
	ITransaction1Dao transaction1;
	@Autowired
	ITransaction2Dao transaction2;
	
	@Autowired
	TransactionTemplate transactionTemplate;
	
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	(독립적인 트랜잭션) : 메서드를 실행하는 도중에 새로운 트랜잭션을 시작
//	부모 트랜잭션에는 영향을 미치지 않는다. 따라서 롤백이 발생해도 부모 트랜잭션은 계속 진행된다.
	@Transactional(propagation = Propagation.REQUIRED)
//	(부모 트랜잭션 사용) : 메서드를 실행하는 도중에 이미 진행 중인 트랜잭션이 있더라도 새로운 트랜잭션을 시작한다.
//	메서드 내에서 롤백이 발생하면 부모 트랜잭션도 롤백된다.
//	@Override
	public int buy(String consumerId, int amount, String error) {
		
		try {
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				
				@Override
				protected void doInTransactionWithoutResult(TransactionStatus arg0) {
					transaction1.pay(consumerId, amount);
					// 의도적 에러 발생
					if(error.equals("1")) {
						int n = 10 / 0;
					}
					
					transaction2.pay(consumerId, amount);
				}
			});
			return 1;
		} catch (Exception e) {
			System.out.println("[Transaction Propagation #2] Rollback");
			return 0;
		}
	}
}

// 트랜잭션을 사용하는 방법에는 1. 선언적 방법과 2. 프로그램적 방법이 있다.
// 프로그램적 방법 명식적으로 commit & rollback 선언을 통해 트랜잭션 처리를 하는 방법이다.
// 메서드 단위보다 더 작은 단위로 트랜잭션 처리를 할 때 사용할 수 있다.
