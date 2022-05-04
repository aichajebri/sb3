package com.aisha.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisha.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}