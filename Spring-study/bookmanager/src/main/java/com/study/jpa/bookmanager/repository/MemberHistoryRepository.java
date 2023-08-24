package com.study.jpa.bookmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.jpa.bookmanager.domain.MemberHistory;

public interface MemberHistoryRepository extends JpaRepository<MemberHistory, Long> {

}
