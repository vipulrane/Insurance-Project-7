package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Premium;
import com.example.repository.PremiumRepository;
import com.example.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	// save Premium details of user
	@Override
	public Premium savePremiumDetails(Premium premium) {
		Premium premium1 = premiumRepository.save(premium);
		return premium1;
	}

}
