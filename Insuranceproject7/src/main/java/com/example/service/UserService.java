package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	//Saving user details
	public User saveUser(User user);
	
	//get all user details
	public List<User> getAllUserDetails();
	
	//delete user by id
	public void deleteUserById(Integer id);
	
	//get user details by id
	public User getUserById(Integer id);
}
