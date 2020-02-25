package com.sonnguyen.webdochoioto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonnguyen.webdochoioto.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {
	List<Roles> findOneById(Integer id);
}
