package fr.bediss;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.bediss.entities.Categorie;
import fr.bediss.entities.Produit;
import fr.bediss.repositories.ProduitRepository;

@SpringBootTest
class ProduitCategorieApplicationTests {

	// Je teste mon Crud
	// 1// J'importe mon repository
	@Autowired
	private ProduitRepository produitRepository;

	// 2// Je crée mes méthodes de Tests

	// 2 - a// Test sur la création d'un Produit
	@Test
	public void testCreateProduit() {
		Produit produit = new Produit(null, "PS 5", 499.50, new Date(2018 - 1900, 11, 21), null);
		produitRepository.save(produit);
		System.out.println("POST " + produit);
	}

	@Test
	public void testFindProduitByNom() {
		List<Produit> prods = produitRepository.findByNomProduit("Pc Dell");

		for (Produit p : prods)
			System.out.println("Ceci est mon produit cherché " + p);

	}

	@Test
	public void testFindProduitByNomContains() {
		List<Produit> prods = produitRepository.findByNomProduitContains("Asus");

		for (Produit p : prods)
			System.out.println("Ici je chercher le mot Asus " + p);

	}

	@Test
	public void testfindByNomPrix() {
		List<Produit> prods = produitRepository.findByNomPrix("Pc Dell", 1000.0);
		for (Produit p : prods) {
			System.out.println("Je chercher par nom et pas prix " + p);
		}
	}

//	@Test
//	public void testfindByCategorie() {
//		Categorie cat = new Categorie();
//		cat.setIdCat(1L);
//
//		List<Produit> prods = produitRepository.findByCategorie(cat);
//		for (Produit p : prods) {
//			System.out.println("Je cherche une catégorie en particulier " + p);
//		}
//	}

	@Test
	public void findByCategorieIdCat() {
		List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
}
