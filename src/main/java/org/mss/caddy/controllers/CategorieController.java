package org.mss.caddy.controllers;

import java.util.List;

import org.mss.caddy.models.Categorie;
import org.mss.caddy.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategorieController {

	@Autowired
	private CategorieService categorieService;

	@RequestMapping(value = "/categories/{libelle}", method = RequestMethod.GET, produces = "application/json")
	public Categorie getCategorieByLibelle(@PathVariable("libelle") String libelle) {
		Categorie categorie = categorieService.findByLibelle(libelle);
		return categorie;
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = "application/json")
	public List<Categorie> getAll() {
		return categorieService.findAll();
	}
}
