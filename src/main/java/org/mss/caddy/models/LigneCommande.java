package org.mss.caddy.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "LIGNE_COMMANDE")
public class LigneCommande {

	@EmbeddedId
	private LigneCommandePK id;
	@ManyToOne
	@MapsId("numero")
	@JoinColumn(name = "numero_commande")
	@JsonBackReference
	private Commande commande;
	@ManyToOne
	@MapsId("code")
	@JoinColumn(name = "code_produit")
	private Produit produit;
	@Column(name = "QTE", nullable = false)
	private Long qte;
	@Column(name = "PRIX_UNITAIRE", nullable = false)
	private BigDecimal prixUnitaire;
	@Column(name = "PRIX_TOTAL", nullable = false)
	private BigDecimal prixTotal;
	@Column(name = "ETAT", nullable = false)
	private Long etat;

	public LigneCommandePK getId() {
		return id;
	}

	public void setId(LigneCommandePK id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Long getQte() {
		return qte;
	}

	public void setQte(Long qte) {
		this.qte = qte;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public BigDecimal getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(BigDecimal prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Long getEtat() {
		return etat;
	}

	public void setEtat(Long etat) {
		this.etat = etat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prixTotal == null) ? 0 : prixTotal.hashCode());
		result = prime * result + ((prixUnitaire == null) ? 0 : prixUnitaire.hashCode());
		result = prime * result + ((qte == null) ? 0 : qte.hashCode());
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
		LigneCommande other = (LigneCommande) obj;
		if (etat == null) {
			if (other.etat != null)
				return false;
		} else if (!etat.equals(other.etat))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prixTotal == null) {
			if (other.prixTotal != null)
				return false;
		} else if (!prixTotal.equals(other.prixTotal))
			return false;
		if (prixUnitaire == null) {
			if (other.prixUnitaire != null)
				return false;
		} else if (!prixUnitaire.equals(other.prixUnitaire))
			return false;
		if (qte == null) {
			if (other.qte != null)
				return false;
		} else if (!qte.equals(other.qte))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", qte=" + qte + ", prixUnitaire=" + prixUnitaire + ", prixTotal="
				+ prixTotal + ", etat=" + etat + "]";
	}

}
