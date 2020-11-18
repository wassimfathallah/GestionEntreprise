package com.gestion.entreprise.repository;

import org.springframework.data.repository.CrudRepository;

import com.gestion.entreprise.entity.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Long> {

}
