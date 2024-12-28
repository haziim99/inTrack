package com.example.intrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intrack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
