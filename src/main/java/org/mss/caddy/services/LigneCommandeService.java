package org.mss.caddy.services;

import java.util.Collection;

import org.mss.caddy.models.LigneCommande;
import org.mss.caddy.repositories.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneCommandeService {

	@Autowired
	private LigneCommandeRepository ligneCommandeRepository;

	public void addAll(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandeRepository.saveAll(ligneCommandes);
	}
}
