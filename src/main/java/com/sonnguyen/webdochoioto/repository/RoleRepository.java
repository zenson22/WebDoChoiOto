package com.sonnguyen.webdochoioto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonnguyen.webdochoioto.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
