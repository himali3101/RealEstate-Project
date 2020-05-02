package com.cg.realestate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.realestate.model.User;

@Repository
public interface ProfileDao extends JpaRepository<User, Integer>{

	public User findById(int userId);
	public User findByEmailId(String emailId);
	
}
