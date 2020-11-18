package com.gestion.entreprise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.entreprise.entity.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
