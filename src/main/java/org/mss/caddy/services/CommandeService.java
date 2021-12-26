package org.mss.caddy.services;

import java.util.List;

import org.mss.caddy.models.Commande;
import org.mss.caddy.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {

	@Autowired
	private CommandeRepository commandeRepository;

	public Commande add(Commande commande) {
		return commandeRepository.save(commande);
	}

	public List<Commande> getAllByClientCode(String clientCode) {
		return commandeRepository.findAllByClient_Code(clientCode);
	}
}
