package com.gestion.entreprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntrepriseController {

	//pour afficher La page home
	@GetMapping("/")
	public String homeEntreprise() {
		
		return "Entreprise";
	}
	
	
	
}
