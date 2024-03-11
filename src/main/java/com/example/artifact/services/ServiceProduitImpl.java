package com.example.artifact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.artifact.entities.Produit;

import com.example.artifact.repositories.ProduitRepo;

@Service
public class ServiceProduitImpl implements IServiceProduit {
	
	
	private final ProduitRepo produitRepo;
	
	@Autowired
	public ServiceProduitImpl(ProduitRepo produitRepo) {
		
		this.produitRepo=produitRepo;
	}
	

	@Override
	public Produit ajouterProduit(Produit p) {
		return this.produitRepo.save(p);
		
		
	}

	@Override
	public void supprimerProduit(Long id) {
		this.produitRepo.deleteById(id);
		
	}

	@Override
	public Produit modifierProduit(Produit p) {
		return this.produitRepo.save(p);
		
	}

	@Override
	public List<Produit> afficherProduit() {
		
		 return this.produitRepo.findAll();
	}

}
