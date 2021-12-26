package org.mss.caddy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.mss.caddy.models.Categorie;
import org.mss.caddy.models.Client;
import org.mss.caddy.models.Produit;
import org.mss.caddy.services.CategorieService;
import org.mss.caddy.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "org.mss.caddy.controllers", "org.mss.caddy.repositories", "org.mss.caddy.services" })
@SpringBootApplication
public class CaddyProjectApplication {

	@Autowired
	private CategorieService categorieService;

	@Autowired
	private ClientService clientService;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CaddyProjectApplication.class, args);
		CaddyProjectApplication driverClass = ctx.getBean(CaddyProjectApplication.class);
		driverClass.generateRandomClient();
		driverClass.generateCategories();
	}

	private void generateRandomClient() {
		Client client = new Client();
		client.setEmail("karimfarhouti@gmail.com");
		client.setPrenom("Mohamed Karim");
		client.setNom("Farhouti");
		client.setAdresse("8 Rue Hammamet Carthage Byrsa");
		client.setCodePostal(2085L);
		client.setGsm("96679658");
		client.setDateNaissance(LocalDate.of(1996, Month.JANUARY, 10));
		client.setVille("Tunis");
		clientService.add(client);
	}

	private void generateCategories() {
		Categorie c = new Categorie();
		Categorie c1 = new Categorie();
		Categorie c2 = new Categorie();

		List<Categorie> listCategories = new ArrayList<>();

		List<Produit> listProduitsSports = new ArrayList<>();
		List<Produit> listProduitsAlimentation = new ArrayList<>();
		List<Produit> listProduitElectronique = new ArrayList<>();

		Produit ps1 = new Produit();
		ps1.setMarque("Everlast");
		ps1.setModele("12oz");
		ps1.setCaracteristiques("Gants de boxes");
		ps1.setPrixUnitaire(new BigDecimal(10));
		ps1.setQuantite(5L);
		ps1.setCategorie(c);

		Produit ps2 = new Produit();
		ps2.setMarque("Venum");
		ps2.setModele("Golden Boy");
		ps2.setCaracteristiques("Magnifique");
		ps2.setPrixUnitaire(new BigDecimal(25));
		ps2.setQuantite(8L);
		ps2.setCategorie(c);

		listProduitsSports.add(ps1);
		listProduitsSports.add(ps2);

		c.setLibelle("sport");
		c.setProduits(listProduitsSports);

		Produit pa1 = new Produit();
		pa1.setMarque("Delice");
		pa1.setModele("Delio");
		pa1.setCaracteristiques("Gazeuze");
		pa1.setPrixUnitaire(new BigDecimal(2));
		pa1.setQuantite(26L);
		pa1.setCategorie(c1);

		Produit pa2 = new Produit();
		pa2.setMarque("Randa");
		pa2.setModele("Patte");
		pa2.setCaracteristiques("Fell num deux");
		pa2.setPrixUnitaire(new BigDecimal(1));
		pa2.setQuantite(23L);
		pa2.setCategorie(c1);

		listProduitsAlimentation.add(pa1);
		listProduitsAlimentation.add(pa2);

		c1.setLibelle("alimentation");
		c1.setProduits(listProduitsAlimentation);

		Produit pe1 = new Produit();
		pe1.setMarque("ElectroNebli");
		pe1.setModele("Whatever");
		pe1.setCaracteristiques("Test Case");
		pe1.setPrixUnitaire(new BigDecimal(300));
		pe1.setQuantite(5L);
		pe1.setCategorie(c2);

		Produit pe2 = new Produit();
		pe2.setMarque("EcoStar");
		pe2.setModele("Clim");
		pe2.setCaracteristiques("12000pA");
		pe2.setPrixUnitaire(new BigDecimal(1100));
		pe2.setQuantite(3L);
		pe2.setCategorie(c2);

		listProduitElectronique.add(pe1);
		listProduitElectronique.add(pe2);

		c2.setLibelle("electronique");
		c2.setProduits(listProduitElectronique);

		listCategories.add(c);
		listCategories.add(c1);
		listCategories.add(c2);

		categorieService.addAll(listCategories);
	}
}
