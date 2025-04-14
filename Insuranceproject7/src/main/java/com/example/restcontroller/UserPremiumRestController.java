package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Bill;
import com.example.entity.Premium;
import com.example.entity.User;
import com.example.service.BillService;
import com.example.service.PremiumService;
import com.example.service.UserService;

@RestController
public class UserPremiumRestController {

	@Autowired
	private BillService billService;

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

	// get user details by Id Restful web service
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		User user1 = userservice.getUserById(id);
		return user1;
	}

	//////////////////////////////////////////////////////////

	// rest controllers for bill entity
	@PostMapping("/saveBill")
	public Bill saveBill(@RequestBody Bill bill) {

		Bill bill1 = billService.saveBill(bill);

		return bill1;
	}

	@PutMapping("/updateBill")
	public Bill updateBill(@RequestBody Bill bill) {

		Bill bill1 = billService.updateBill(bill);

		return bill1;
	}

	@GetMapping("/getBillById/{id}")
	public List<Bill> getBillById(@PathVariable("id") Integer id) {
		List<Bill> bill1 = billService.getBillById(id);
		return bill1;
	}
	
	@DeleteMapping("/deleteBill/{id}")
	public String deleteBill(@PathVariable("id") Integer id) {
		billService.deleteBill(id);
		
		return "Record is deleted successfully..";
	}

}
