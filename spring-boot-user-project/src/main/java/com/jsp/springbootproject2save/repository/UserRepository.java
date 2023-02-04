package com.jsp.springbootproject2save.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootproject2save.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
