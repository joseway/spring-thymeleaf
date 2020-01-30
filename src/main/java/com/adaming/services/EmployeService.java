package com.adaming.services;

import java.util.List;

import com.adaming.models.Employe;

public interface EmployeService {
	
	public Employe save(Employe emp);
	
	public List<Employe> findAll();
	
	public Employe findById(Long id);
	
	public List<Employe> findByNom(String nom);
	
	public List<Employe> findByPrenomAndEmail(String prenom, String email);
	
	public List<Employe> findByNomLike(String nom);
}
