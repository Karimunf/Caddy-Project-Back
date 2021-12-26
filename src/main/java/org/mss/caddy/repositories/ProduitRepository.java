package org.mss.caddy.repositories;

import org.mss.caddy.models.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, String> {

}
