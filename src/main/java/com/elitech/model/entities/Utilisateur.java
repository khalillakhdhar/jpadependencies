package com.elitech.model.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.elitech.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur extends BaseEntity{

	
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	private int age;
	
	@Column(nullable = false,unique = true)
	private String telephone;
	@OneToMany(mappedBy = "utilisateur")
	List<Commandes> commandes;
	@OneToOne(mappedBy = "utilisateur",cascade = CascadeType.ALL)
	private Adresse adresse;
}
