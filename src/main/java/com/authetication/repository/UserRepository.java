package com.authetication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authetication.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	public User findByUsername(String user);

}
