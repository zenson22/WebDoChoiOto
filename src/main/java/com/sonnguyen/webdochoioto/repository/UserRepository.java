package com.sonnguyen.webdochoioto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonnguyen.webdochoioto.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findOneByUsernameAndStatus(String name, Integer activeStatus);
}
