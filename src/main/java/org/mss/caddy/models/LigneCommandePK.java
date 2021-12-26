package org.mss.caddy.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LigneCommandePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2984504680688965916L;

	@Column(name = "CODE_PRODUIT")
	private String codeProduit;
	@Column(name = "NUMERO_COMMANDE")
	private String numeroCommande;

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(String numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeProduit == null) ? 0 : codeProduit.hashCode());
		result = prime * result + ((numeroCommande == null) ? 0 : numeroCommande.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneCommandePK other = (LigneCommandePK) obj;
		if (codeProduit == null) {
			if (other.codeProduit != null)
				return false;
		} else if (!codeProduit.equals(other.codeProduit))
			return false;
		if (numeroCommande == null) {
			if (other.numeroCommande != null)
				return false;
		} else if (!numeroCommande.equals(other.numeroCommande))
			return false;
		return true;
	}

}
