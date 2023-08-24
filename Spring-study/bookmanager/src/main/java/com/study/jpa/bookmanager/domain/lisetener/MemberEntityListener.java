package com.study.jpa.bookmanager.domain.lisetener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.jpa.bookmanager.domain.Member;
import com.study.jpa.bookmanager.domain.MemberHistory;
import com.study.jpa.bookmanager.repository.MemberHistoryRepository;
import com.study.jpa.bookmanager.support.BeanUtils;

public class MemberEntityListener {	// EntityListener는 스프링 빈을 주입받지 못한다. 별도의 클래스를 통해 가능.

	@PrePersist
	@PreUpdate
	public void preUpdate(Object obj) {
		MemberHistoryRepository memberHistoryRepository = BeanUtils.getBean(MemberHistoryRepository.class);
		Member member = (Member) obj;
		
		MemberHistory memberHistory = new MemberHistory();
		memberHistory.setMemberId(member.getId());
		memberHistory.setName(member.getName());
		memberHistory.setEmail(member.getEmail());
		
		memberHistoryRepository.save(memberHistory);
		
	}
}
