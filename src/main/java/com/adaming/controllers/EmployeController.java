package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/employes")
public class EmployeController {

	@RequestMapping(value="")
	public String findALl() {
		return "employes";
	}
}
