package org.mss.caddy.controllers;

import java.util.List;

import org.mss.caddy.dtos.CommandeClientDTO;
import org.mss.caddy.models.Commande;
import org.mss.caddy.services.CommandeService;
import org.mss.caddy.services.LigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommandeController {

	@Autowired
	private CommandeService commandeService;
	@Autowired
	private LigneCommandeService ligneCommandeService;

	@RequestMapping(value = "/commandes", method = RequestMethod.POST, consumes = "application/json")
	public Commande ajouterCommande(@RequestBody CommandeClientDTO commandeClientDTO) {
		Commande co = commandeClientDTO.getCommande();
		co.setClient(commandeClientDTO.getClient());
		commandeService.add(co);
		co.getLigneCommandes().forEach(e -> {
			e.setCommande(co);
			e.getId().setNumeroCommande(co.getNumero());
		});
		ligneCommandeService.addAll(co.getLigneCommandes());
		return co;
	}

	@RequestMapping(value = "/commandes/{clientCode}", method = RequestMethod.GET, produces = "application/json")
	public List<Commande> getAllByClient(@PathVariable("clientCode") String clientCode) {
		List<Commande> list = commandeService.getAllByClientCode(clientCode);
		return list;
	}
}
