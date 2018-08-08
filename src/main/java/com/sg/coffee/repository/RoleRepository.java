package com.sg.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.coffee.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
