package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.models.Departement;
import com.adaming.models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

	public List<Employe> findByNom(String nom);
	
	public List<Employe> findByPrenomAndEmail(String prenom, String email);
	
	public List<Employe> findByNomLike(String nom);
	
	public List<Employe> findByDepartement(Departement dept);
	
	public List<Employe> findByDepartementNom(String deptNom);
}
