package com.assessment.services;

import java.util.List;

import com.assessment.entities.Lead;

public interface LeadServiceInf {
	public void saveLead(Lead lead);
	public List<Lead> listAll();
	public void deleteLeadById(long id);
	public Lead getLeadById(long id);
}
