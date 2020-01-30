package com.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.models.Employe;
import com.adaming.services.DepartementService;
import com.adaming.services.EmployeService;

@Controller
@RequestMapping(value="/employes")
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	@Autowired
	private DepartementService departementService;

	@RequestMapping(value="")
	public String findAll(Model model) {
		model.addAttribute("employe", new Employe());
		model.addAttribute("departements", departementService.findAll());
		model.addAttribute("employes", employeService.findAll());
		
		/*
		public List<Employe> findByNom(String nom);	
		st<Employe> findByPrenomAndEmail(String prenom, String email);	
		public List<Employe> findByNomLike(String nom); 
		
		*/
		/*
		List<Employe> byPrenomEmail = employeService.findByPrenomAndEmail("Christophe", "chris@dubois.com");
		for(Employe e : byPrenomEmail) {
			System.out.println(e.getNom() + " " + e.getPrenom());
		}
		*/
		List<Employe> like = employeService.findByNomLike("%Du%");
		for(Employe e : like) {
			System.out.println(e.getNom() + " " + e.getPrenom());
		}
		/*
		List<Employe> byNom = employeService.findByNom("dupont");
		System.out.println("Nom:  " + byNom.size());
		for(Employe e : byNom) {
			System.out.println(e.getNom() + " " + e.getPrenom());
		}
		*/
		
		
		return "employes";
	}
	@PostMapping(value="")
	public String save(@ModelAttribute("employe")Employe employe) {
		
		employeService.save(employe);
		return "redirect:/employes";
	}
}
