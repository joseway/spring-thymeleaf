package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.models.Departement;
import com.adaming.services.DepartementService;

@Controller
@RequestMapping(value="/departements")
public class DepartementController {
	
	@Autowired
	private DepartementService departementService;

	@RequestMapping(value="")
	public String findAll(Model model) {
		model.addAttribute("departements", departementService.findAll());
		
		return "departements";
	}
	//@RequestMapping(value="/{id}", method=RequestMethod.POST)
	@GetMapping(value="/{id}")
	public String findById(@PathVariable("id")Long id, Model model) {
		model.addAttribute("departement", departementService.findById(id));
		
		return "departement";
	}
	@GetMapping(value="/creer")
	public String creer(Model model) {
		model.addAttribute("departement", new Departement());
		return "nouveauDepartement";
	}
	@PostMapping(value="")
	public String creer(@ModelAttribute("departement")Departement departement) {
		departementService.save(departement);
		
		return "redirect:/departements";
	}
	@GetMapping(value="/update/{did}")
	public String update(@PathVariable("did")Long id, Model model) {
		Departement d = departementService.findById(id);
		model.addAttribute("departement", d);
		return "updateDepartement";
	}
	
}
