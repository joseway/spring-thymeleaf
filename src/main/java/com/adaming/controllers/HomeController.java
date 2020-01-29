package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.services.DepartementService;

@Controller
public class HomeController {

	@Autowired
	private DepartementService departementService;
	
	@RequestMapping(value="/")
	public String home(Model model) {
		model.addAttribute("title", "Welcome to my site");
		model.addAttribute("departements", departementService.findAll());
		System.out.println("Test");
		/*
		String[] names = {"Pierre", "Steven", "Mary"};
		model.addAttribute("names", names);
		
		boolean estActif = false;
		model.addAttribute("estActif", estActif);
		Utilisateur u1 = new Utilisateur(1l, "Thomas");
		model.addAttribute("u1", u1);
		*/
		
		return "index";
	}
}
