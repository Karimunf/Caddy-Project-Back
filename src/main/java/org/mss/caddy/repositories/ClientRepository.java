package org.mss.caddy.repositories;

import org.mss.caddy.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {

	Client findByEmail(String email);
}
