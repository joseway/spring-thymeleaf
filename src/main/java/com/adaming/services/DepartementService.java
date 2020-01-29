package com.adaming.services;

import java.util.List;

import com.adaming.models.Departement;

public interface DepartementService {

	public List<Departement> findAll();
	
	public Departement save(Departement dept);
	
	public Departement findById(Long id);
}
