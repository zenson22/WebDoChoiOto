package com.sonnguyen.webdochoioto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonnguyen.webdochoioto.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	Users findOneByUsernameAndStatus(String name, boolean activeStatus);
}
