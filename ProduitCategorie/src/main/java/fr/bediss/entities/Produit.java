package fr.bediss.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Produit {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProduit;
	
	@NotNull
//	@Size (min = 4,max = 15)
	private String nomProduit;
	
//	@Min(value = 10)
//	 @Max(value = 10000)
	private Double prixProduit;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
//	@PastOrPresent

	private Date dateCreation;
	
	
	@ManyToOne
	private Categorie categorie;
}
