package com.example.artifact.services;

import java.util.List;

import com.example.artifact.entities.Produit;

	public interface IServiceProduit  {
		
		public Produit ajouterProduit(Produit p) ;
		public void supprimerProduit(Long id);
		public Produit modifierProduit(Produit p);
		public List<Produit> afficherProduit();
		
	
	}
