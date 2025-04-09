package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Premium;
import com.example.entity.User;
import com.example.service.PremiumService;
import com.example.service.UserService;

@RestController
public class UserPremiumRestController {

	@Autowired
	private PremiumService premiumService;

	@Autowired
	private UserService userservice;

	// save restful web service for user details
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1 = userservice.saveUser(user);
		return user1;
	}

	// get all user details Restful web service
	@GetMapping("/getAllUserDetails")
	public List<User> getAllUserDetails() {
		List<User> userlist = userservice.getAllUserDetails();
		return userlist;
	}
	
	// delete user by id RestFul web service
	@DeleteMapping("/deleteUserById/{id}")
	public String deleteUserById(@PathVariable("id") Integer id) {
		userservice.deleteUserById(id);
		return "Record is deleted successfully..";
	}

	// save restful web service for premium details
	@PostMapping("/savePremiumDetails")
	public Premium savePremiumDetails(@RequestBody Premium premium) {
		Premium premium1 = premiumService.savePremiumDetails(premium);
		return premium1;
	}
	

}
