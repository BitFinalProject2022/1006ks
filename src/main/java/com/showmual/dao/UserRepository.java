package com.showmual.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showmual.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findOneById(String id);
}
