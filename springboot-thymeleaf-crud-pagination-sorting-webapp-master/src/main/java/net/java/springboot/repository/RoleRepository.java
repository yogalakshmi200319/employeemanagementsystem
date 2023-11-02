package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
