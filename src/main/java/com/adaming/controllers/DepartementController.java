package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/departements")
public class DepartementController {

	@RequestMapping(value="")
	public String findAll() {
		return "departements";
	}
}
