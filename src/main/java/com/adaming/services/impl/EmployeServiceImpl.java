package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Employe;
import com.adaming.repositories.EmployeRepository;
import com.adaming.services.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public Employe save(Employe emp) {
		
		return employeRepository.save(emp);
	}

	@Override
	public List<Employe> findAll() {
		
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(Long id) {
		
		return employeRepository.findById(id).get();
	}

}
