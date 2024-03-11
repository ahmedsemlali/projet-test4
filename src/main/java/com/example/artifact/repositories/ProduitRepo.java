package com.example.artifact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.artifact.entities.Produit;

@Repository
public interface ProduitRepo extends JpaRepository<Produit, Long> {

}
