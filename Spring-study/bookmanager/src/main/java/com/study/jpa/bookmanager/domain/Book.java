package com.study.jpa.bookmanager.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.study.jpa.bookmanager.domain.lisetener.Auditable;
import com.study.jpa.bookmanager.domain.lisetener.MemberEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Book extends BaseEntity implements Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String author;
	
//	@Column(name = "created_at")
//	@CreatedDate
//	private LocalDateTime createdAt;
//	
//	@Column(name = "updated_at")
//	@LastModifiedDate
//	private LocalDateTime updatedAt;
	
//	@PrePersist
//	public void prePersist() {
//		this.createdAt = LocalDateTime.now();
//		this.updatedAt = LocalDateTime.now();
//	}
//	
//	@PreUpdate
//	public void preUpdate() {
//		this.updatedAt = LocalDateTime.now();
//	}
}
