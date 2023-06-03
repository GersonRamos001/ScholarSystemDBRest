package com.ra.unisystem.repositorio;

import com.ra.unisystem.modelo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}