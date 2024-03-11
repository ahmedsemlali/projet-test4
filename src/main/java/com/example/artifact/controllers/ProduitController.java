package com.example.artifact.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.artifact.entities.Produit;

import com.example.artifact.services.ServiceProduitImpl;


@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	private final ServiceProduitImpl service ;
	
	
	
	public ProduitController(ServiceProduitImpl service) {
		this.service = service;
	}
	
	@PostMapping("/add")
	public Produit addProduct(@RequestBody Produit produit) {
		return service.ajouterProduit(produit);
		
	}
	
	@PutMapping("/update")
	public Produit updateProduct(@RequestBody Produit produit) {
		return service.modifierProduit(produit);
		
	}
	
	@DeleteMapping("/delete")
	public void deleteProduit(@RequestParam Long id) {
		 service.supprimerProduit(id);
		
	}
	

	
	@GetMapping("/getAll")
	public List<Produit> getAllProduct() {
		return  service.afficherProduit();
		
	}
	

}
