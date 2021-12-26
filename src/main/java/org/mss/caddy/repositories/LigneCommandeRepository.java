package org.mss.caddy.repositories;

import org.mss.caddy.models.LigneCommande;
import org.mss.caddy.models.LigneCommandePK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepository extends CrudRepository<LigneCommande, LigneCommandePK> {

}
