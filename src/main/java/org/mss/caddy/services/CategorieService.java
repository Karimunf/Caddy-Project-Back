package org.mss.caddy.services;

import java.util.Collection;
import java.util.List;

import org.mss.caddy.models.Categorie;
import org.mss.caddy.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepository categorieRepository;

	public Categorie findByLibelle(String libelle) {
		return categorieRepository.findByLibelle(libelle);
	}

	public List<Categorie> findAll() {
		List<Categorie> categories = (List<Categorie>) categorieRepository.findAll();
		return categories;
	}

	public Categorie add(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	public void addAll(Collection<Categorie> categories) {
		categorieRepository.saveAll(categories);
	}
}
