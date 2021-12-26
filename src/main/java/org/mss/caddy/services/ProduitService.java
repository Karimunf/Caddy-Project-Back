package org.mss.caddy.services;

import java.util.Collection;

import org.mss.caddy.models.Produit;
import org.mss.caddy.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository produitRepository;

	public void addAll(Collection<Produit> produits) {
		produitRepository.saveAll(produits);
	}
}
