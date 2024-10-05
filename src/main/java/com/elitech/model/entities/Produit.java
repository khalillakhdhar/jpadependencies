package com.elitech.model.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Produit extends BaseEntity {
private String nom;
private int quantite;
private String description;
private double prix;
@ManyToMany(fetch = FetchType.EAGER)
private List<Categories> categories;

}
