package com.elitech.model.entities;

import com.elitech.model.BaseEntity;

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
public class Livreur extends BaseEntity {
private String nom;
private String region;
private int code;
}
