package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.services.DepartementService;

@Controller
@RequestMapping(value="/departements")
public class DepartementController {
	
	@Autowired
	private DepartementService departementService;

	@RequestMapping(value="")
	public String findAll() {
		return "departements";
	}
	//@RequestMapping(value="/{id}", method=RequestMethod.POST)
	@GetMapping(value="/{id}")
	public String findById(@PathVariable("id")Long id, Model model) {
		model.addAttribute("departement", departementService.findById(id));
		
		return "departement";
	}
}
