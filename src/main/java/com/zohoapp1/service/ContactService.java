package com.zohoapp1.service;

import java.util.List;

import com.zohoapp1.entities.Contact;


public interface ContactService {

	public void saveContact(Contact contact);
	public List<Contact> listContacts();
	public Contact getOneContact(long id);
	
}
