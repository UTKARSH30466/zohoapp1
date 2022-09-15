package com.zohoapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zohoapp1.entities.Contact;
import com.zohoapp1.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/listallCon")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts",contacts);
		return "search_contact_result";
	}

}
