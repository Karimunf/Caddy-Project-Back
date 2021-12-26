package org.mss.caddy.services;

import org.mss.caddy.models.Client;
import org.mss.caddy.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client add(Client client) {
		return clientRepository.save(client);
	}

	public Client findByEmail(String email) {
		return clientRepository.findByEmail(email);
	}
}
