package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
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
	
	@Override
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
			System.out.println("[TransactionTemplate] Rollback");
			return 0;
		}
	}
}

// 트랜잭션을 사용하는 방법에는 1. 선언적 방법과 2. 프로그램적 방법이 있다.
// 프로그램적 방법 명식적으로 commit & rollback 선언을 통해 트랜잭션 처리를 하는 방법이다.
// 메서드 단위보다 더 작은 단위로 트랜잭션 처리를 할 때 사용할 수 있다.
