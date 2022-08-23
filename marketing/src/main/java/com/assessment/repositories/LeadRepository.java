package com.assessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
