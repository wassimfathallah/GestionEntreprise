package com.gestion.entreprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entreprise.entity.Entreprise;
import com.gestion.entreprise.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService {

	@Autowired
	EntrepriseRepository entrepriseRepository;

	@Override
	public Entreprise createEntreprise(String nom, String zone, String immatriculation, String adresse) {
		Entreprise entreprise = new Entreprise();

		entreprise.setNom(nom);
		entreprise.setZone(zone);
		entreprise.setImmatriculation(immatriculation);
		entreprise.setAdresse(adresse);
		return entrepriseRepository.save(entreprise);
	}

}
