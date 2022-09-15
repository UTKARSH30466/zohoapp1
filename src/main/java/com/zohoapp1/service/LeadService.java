package com.zohoapp1.service;
import java.util.List;

import com.zohoapp1.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead getOneLeadById(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listLeads();

}
