package com.adaming.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String prenom;
	private String nom;
	
	private String email;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.DETACH})
	@JoinColumn(name="departement_id")
	private Departement departement;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	
	public Employe() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", departement="
		/* + departement.getNom() */ + ", adresse=" + adresse + "]";
	}
}
