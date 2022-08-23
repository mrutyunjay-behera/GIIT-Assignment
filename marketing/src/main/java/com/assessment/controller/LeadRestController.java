package com.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entities.Lead;
import com.assessment.services.LeadServiceImpl;

@RestController
@RequestMapping("/leads")
public class LeadRestController {
	@Autowired
	private LeadServiceImpl leadService;
	
	@GetMapping
	public List<Lead> getJsonByLead(){
		List<Lead> leads = leadService.listAll();
		return leads;
	}
	
	@PostMapping
	public void postJsonByOneLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
	}
	
	@PutMapping
	public void postJsonByUpdateLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable long id) {
		leadService.deleteLeadById(id);
	}
	
	
	//Developing end point
	
	@GetMapping("/api/get/{id}")
	public Lead getOneLead(@PathVariable("id") long id) {
		Lead lead = leadService.getLeadById(id);
		return lead;
	}
	
}