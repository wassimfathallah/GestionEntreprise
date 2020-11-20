package com.gestion.entreprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.entreprise.entity.Entreprise;
import com.gestion.entreprise.service.EntrepriseService;

@Controller
public class EntrepriseController {
	@Autowired
	EntrepriseService entrepriseService;
	// pour afficher La page home

	@GetMapping("/")
	public String homeEntreprise(Model model) {
		model.addAttribute("AllEntreprise", entrepriseService.getAllEntreprise());

		return "Entreprise";
	}

	// pour creer une entreprise
	@PostMapping("/CreateEntreprise")
	public String createEntreprise(@RequestParam("nom") String nom, @RequestParam("zone") String zone,
			@RequestParam("immatriculation") String immatriculation, @RequestParam("adresse") String adresse) {
		entrepriseService.createEntreprise(nom, zone, immatriculation, adresse);
		return "redirect:/";

	}

	
	
	// pour modifier une entreprise
		@GetMapping("/updateEntreprise/{id}")
		public String updateEntreprise(@PathVariable(value = "id") Long id, Model model) {
			
			Entreprise entreprise = entrepriseService.getEntrepriseById(id) ;	
			model.addAttribute("entrepriseUpdate", entreprise);  
				
				return "redirect:/";

			}
		@GetMapping("/deleteEntreprise/{id}") 
		public String deleteEntrepriseById(@PathVariable(value = "id") Long id) {  
			entrepriseService.deleteEntreprise(id);
			return "redirect:/"; 
			}
	
}
