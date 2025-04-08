package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Premium;
import com.example.service.PremiumService;

@RestController
public class UserPremiumRestController {

	@Autowired
	private PremiumService premiumService;

	// save restful web service for premium details
	@PostMapping("/savePremiumDetails")
	public Premium savePremiumDetails(@RequestBody Premium premium) {
		Premium premium1 = premiumService.savePremiumDetails(premium);
		return premium1;
	}

}
