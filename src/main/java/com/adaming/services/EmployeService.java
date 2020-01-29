package com.adaming.services;

import java.util.List;

import com.adaming.models.Employe;

public interface EmployeService {
	
	public Employe save(Employe emp);
	
	public List<Employe> findAll();
	
	public Employe findById(Long id);
}
