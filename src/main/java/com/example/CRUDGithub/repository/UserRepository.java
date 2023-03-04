package com.example.CRUDGithub.repository;

import com.example.CRUDGithub.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
