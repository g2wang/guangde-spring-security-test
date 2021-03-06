package com.g2wang.spring.security.example.resourceserver.db;

import com.g2wang.spring.security.example.resourceserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, String> {
}
