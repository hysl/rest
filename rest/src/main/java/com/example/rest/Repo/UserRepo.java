package com.example.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
