package org.mss.caddy.controllers;

import org.mss.caddy.models.Client;
import org.mss.caddy.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/clients/{email}",method = RequestMethod.GET,produces = "application/json")
	public Client getClientByEmail(@PathVariable("email") String email) {
		return clientService.findByEmail(email);
	}
}
