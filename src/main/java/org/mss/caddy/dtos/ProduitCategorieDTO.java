package org.mss.caddy.dtos;

import java.util.ArrayList;
import java.util.List;

import org.mss.caddy.models.Categorie;
import org.mss.caddy.models.Produit;

public class ProduitCategorieDTO {

	private Categorie categorie;
	private List<Produit> produits = new ArrayList<>();

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
