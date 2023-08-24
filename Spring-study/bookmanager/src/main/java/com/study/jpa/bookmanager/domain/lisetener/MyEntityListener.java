package com.study.jpa.bookmanager.domain.lisetener;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class MyEntityListener {	// EntityListener는 스프링 빈을 주입받지 못한다. 별도의 클래스를 통해 가능.
	
	@PrePersist
	public void prePersist(Object obj) {
		
		if(obj instanceof Auditable) {
			((Auditable) obj).setCreatedAt(LocalDateTime.now());
			((Auditable) obj).setUpdatedAt(LocalDateTime.now());
			
		}
		
	}
	
	@PreUpdate
	public void preUpdate(Object obj) {
		if(obj instanceof Auditable) {
			((Auditable) obj).setUpdatedAt(LocalDateTime.now());
		}
	}
}
