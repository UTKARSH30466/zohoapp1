package com.zohoapp1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.zohoapp1.entities.Billing;
import com.zohoapp1.repositories.BillingRepository;

public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);

	}

}
