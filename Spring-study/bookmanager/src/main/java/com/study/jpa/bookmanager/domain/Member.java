package com.study.jpa.bookmanager.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.study.jpa.bookmanager.domain.lisetener.Auditable;
import com.study.jpa.bookmanager.domain.lisetener.MemberEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity	// JPA에서 관리하는 Entity 객체로 지정
@EntityListeners(value = {MemberEntityListener.class})
public class Member extends BaseEntity implements Auditable {
	
	@Id	// primary 키 지정.
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// 
	private Long id;	// 개발자가 직접 세팅하는 값이 아님.
	
	@NonNull
	private String name;
	
	@NonNull
	private String email;
	
	@Column(name = "created_at", updatable = false)
	@CreatedDate
	// name : 컬럼 이름 지정, nullable : false일 경우 null 값을 허용하지 않음.
	private LocalDateTime createdAt;
	
//	@Column(name = "updated_at")
//	@LastModifiedDate
//	private LocalDateTime updatedAt;
//	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
//	@Transient	// ddl에 반영되지 않음
//	private String testData;
	
//	@OneToMany(fetch = FetchType.EAGER)
//	private List<Address> address;
	
//	@PrePersist	// 현업에서 가장 많이 사용함, 감시하는 역할
//	public void prePersist() {
//		this.createdAt = LocalDateTime.now();
//		this.updatedAt = LocalDateTime.now();
//	}
	
//	@PostPersist
//	public void postPersist() {
//		System.out.println(">>> postPersist");
//	}
	
//	@PreUpdate	// 현업에서 가장 많이 사용함, 감시하는 역할
//	public void preUpdate() {
//		this.updatedAt = LocalDateTime.now();
//	}
	
//	@PostUpdate
//	public void postUpdate() {
//		System.out.println(">>> postUpdate");
//	}
	
//	@PreRemove
//	public void preRemove() {
//		System.out.println(">>> preRemove");
//	}
	
//	@PostRemove
//	public void postRemove() {
//		System.out.println(">>> postRemove");
//	}
	
//	@PostLoad
//	public void postLoad() {
//		System.out.println(">>> postLoad");
//	}
	
	
}
