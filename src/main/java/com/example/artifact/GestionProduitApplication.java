package com.example.artifact;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.artifact.entities.Produit;

import com.example.artifact.repositories.ProduitRepo;



@SpringBootApplication
public class GestionProduitApplication {
	
	
	
	@Bean
	CommandLineRunner commandLineRunner(ProduitRepo productRepo) {
		return args -> {
			productRepo.save(new Produit( "lib",  14.4, "cat", "des", 12));
			
		};
	}
	

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(GestionProduitApplication.class, args);
	}
	

}
