package com.tutorial1.apiserver1.repository;

import java.util.Optional;

import com.tutorial1.apiserver1.models.ERole;
import com.tutorial1.apiserver1.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
