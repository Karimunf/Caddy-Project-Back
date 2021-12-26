package org.mss.caddy.controllers;

import java.util.List;

import org.mss.caddy.dtos.ProduitCategorieDTO;
import org.mss.caddy.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProduitController {

	@Autowired
	private ProduitService produitService;

	@RequestMapping(value = "/produits", method = RequestMethod.POST, consumes = "application/json")
	public void ajouterProduits(@RequestBody List<ProduitCategorieDTO> produitCategorieDTO) {
		for (ProduitCategorieDTO pcd : produitCategorieDTO) {
			pcd.getProduits().forEach(e -> e.setCategorie(pcd.getCategorie()));
			produitService.addAll(pcd.getProduits());
		}
	}
}
