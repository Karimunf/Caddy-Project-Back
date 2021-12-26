package org.mss.caddy.repositories;

import org.mss.caddy.models.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, String> {

	Categorie findByLibelle(String libelle);
}
