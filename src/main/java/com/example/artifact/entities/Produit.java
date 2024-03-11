package com.example.artifact.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Produit {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private Double  prix;
	private String categorie;
	private String description;
	private int quantite;
	

	
	public Produit() {
		super();
	}
	
	
	
	public Produit(Long id, String libelle, Double prix, String categorie, String description, int quantite) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		this.description = description;
		this.quantite = quantite;
	}



	public Produit(String libelle, Double prix, String categorie, String description, int quantite) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		this.description = description;
		this.quantite = quantite;
	}
	
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
