package fr.bediss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bediss.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
