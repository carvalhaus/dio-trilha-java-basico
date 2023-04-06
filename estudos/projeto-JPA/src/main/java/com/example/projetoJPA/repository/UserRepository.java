package com.example.projetoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoJPA.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}