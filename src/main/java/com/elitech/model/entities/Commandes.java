package com.elitech.model.entities;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Commandes extends BaseEntity{
@Column(columnDefinition = "varchar(30) default 'attente'")
private String etat;
private int quantite;
}
