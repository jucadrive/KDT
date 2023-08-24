package com.study.jpa.bookmanager.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@EntityListeners(value = AuditingEntityListener.class)
@Data
@MappedSuperclass	// 해당 클래스의 필드를 상속받는 엔티티의 컬럼으로 포함시켜준다.
public class BaseEntity {

	@CreatedDate
	private LocalDateTime createdAt;
	
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
