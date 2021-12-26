package org.mss.caddy.repositories;

import java.util.List;

import org.mss.caddy.models.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, String> {

	List<Commande> findAllByClient_Code(String code);
}
