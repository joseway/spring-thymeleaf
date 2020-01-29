package com.adaming.controllers;

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
		
		return "employes";
	}
	@PostMapping(value="")
	public String save(@ModelAttribute("employe")Employe employe) {
		
		employeService.save(employe);
		return "redirect:/employes";
	}
}
