package com.gestion.entreprise.service;

import java.util.List;

import com.gestion.entreprise.entity.Entreprise;

public interface EntrepriseService {

	
	Entreprise  createEntreprise(String nom, String zone, String immatriculation, String adresse);
	List<Entreprise> getAllEntreprise();
	 Entreprise getEntrepriseById(Long id);
	 void deleteEntreprise(Long id);
}
