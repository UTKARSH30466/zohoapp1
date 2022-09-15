package com.zohoapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoapp1.entities.Billing;
import com.zohoapp1.entities.Contact;
import com.zohoapp1.service.BillingService;
import com.zohoapp1.service.ContactService;

@Controller
public class BillingController {
	
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getOneContact(id);
		model.addAttribute("contact", contact);
	return "generate_bill";
}
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill) {
		billingService.saveBill(bill);
		return "search_billiing_result";
	}
}