package fr.bediss.services.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.bediss.entities.Categorie;
import fr.bediss.entities.Produit;
import fr.bediss.repositories.ProduitRepository;
import fr.bediss.services.ProduitService;


@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired ProduitRepository pr;

	@Override
	public Produit saveProduit(Produit p) {
		return pr.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return pr.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		pr.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		pr.deleteById(id);		
	}

	@Override
	public Produit getProduit(Long id) {
		return pr.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return pr.findAll();
	}

	
	
	
	@Override
	public List<Produit> findByNomProduit(String nom) {
//		pr.findByNomProduit(nom);
		return pr.findByNomProduit(nom);
	}

	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		
		return pr.findByNomProduitContains(nom);
	}

	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return pr.findByNomPrix(nom, prix);
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return pr.findByCategorie(categorie);

	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return pr.findByCategorieIdCat(id);

	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		return pr.findByOrderByNomProduitAsc();
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return pr.trierProduitsNomsPrix();
	}

}
