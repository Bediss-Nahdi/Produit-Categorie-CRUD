package fr.bediss.services;

import java.util.List;

import fr.bediss.entities.Categorie;
import fr.bediss.entities.Produit;

public interface ProduitService {
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	
	void deleteProduitById(Long id);
	void deleteProduit(Produit p);
		
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	
	
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix (String nom, Double prix);
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();

}
