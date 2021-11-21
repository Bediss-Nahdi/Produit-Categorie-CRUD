package fr.bediss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.bediss.entities.Produit;
import fr.bediss.services.ProduitService;

@RequestMapping("/produit")
@RestController
@CrossOrigin
public class ProduitController {
	
	@Autowired ProduitService ps;
	

	//Ancienne méthode !!
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Produit> getAllProduits() {
		return ps.getAllProduits();
	 }
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {	
		return ps.getProduit(id);
    }
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Produit createProduit(@RequestBody Produit produit) {
		return ps.saveProduit(produit);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
		return ps.updateProduit(produit);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		ps.deleteProduitById(id);
	}
	

}
