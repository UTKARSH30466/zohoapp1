package com.zohoapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoapp1.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
