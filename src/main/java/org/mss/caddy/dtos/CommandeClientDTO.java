package org.mss.caddy.dtos;

import org.mss.caddy.models.Client;
import org.mss.caddy.models.Commande;

public class CommandeClientDTO {

	private Client client;
	private Commande commande;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}
