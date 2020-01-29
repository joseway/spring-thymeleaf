package com.adaming.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	@OneToMany(mappedBy="departement", fetch = FetchType.EAGER)
	private Set<Employe> employes = new HashSet<Employe>();
	
	public Departement() {}

	public Departement(String nom) {
		super();
		this.nom = nom;
	}

	public Departement(String nom, Set<Employe> employes) {
		super();
		this.nom = nom;
		this.employes = employes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}
}
