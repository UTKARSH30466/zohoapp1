package com.zohoapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoapp1.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
