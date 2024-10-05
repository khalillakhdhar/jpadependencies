package com.elitech.model.entities;

import java.util.List;

import com.elitech.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categories extends BaseEntity{
	private String titre;
	@ManyToMany(mappedBy = "categories",cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	private List<Produit> produits;

}
