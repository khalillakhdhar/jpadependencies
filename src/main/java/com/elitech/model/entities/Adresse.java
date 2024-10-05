package com.elitech.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
public class Adresse {
@Id
private long id;	

private String pays;
private int codePostale;
private String ville;
private String region;
@OneToOne(optional = false)
@MapsId
@JoinColumn(name = "id")
private Utilisateur utilisateur;
}
