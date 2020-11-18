package com.gestion.entreprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.entreprise.service.EntrepriseService;

@Controller
public class EntrepriseController {
	@Autowired
	EntrepriseService entrepriseService;
	//pour afficher La page home
	
	@GetMapping("/")
	public String homeEntreprise() {
		
		return "Entreprise";
	}
	
	
	//pour creer une entreprise
	@PostMapping("/CreateEntreprise")
	public String CreateEntreprise(@RequestParam("nom") String nom,@RequestParam("zone") String zone,@RequestParam("immatriculation") String immatriculation , @RequestParam("adresse") String adresse) {
		entrepriseService.createEntreprise(nom, zone, immatriculation, adresse);
		return "redirect:/";
		
	
	}
	
	
}
