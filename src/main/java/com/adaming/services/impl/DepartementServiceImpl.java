package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Departement;
import com.adaming.repositories.DepartementRepository;
import com.adaming.services.DepartementService;

@Service
public class DepartementServiceImpl implements DepartementService{
	
	@Autowired
	private DepartementRepository departementRepository;

	@Override
	public List<Departement> findAll() {
		
		return departementRepository.findAll();
	}

	@Override
	public Departement save(Departement dept) {
		
		return departementRepository.save(dept);
	}

	@Override
	public Departement findById(Long id) {
		
		return departementRepository.findById(id).get();
	}

	
}
