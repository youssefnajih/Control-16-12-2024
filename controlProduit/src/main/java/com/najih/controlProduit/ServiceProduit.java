package com.najih.controlProduit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProduit {

    @Autowired
    private ProduitRepository produitRepository;

    public Produit ajouterProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public List<Produit> consulterTousLesProduits() {
        return produitRepository.findAll();
    }

    public Optional<Produit> rechercherProduitParId(Long idProduit) {
        return produitRepository.findById(idProduit);
    }

    public List<Produit> rechercherProduitParNom(String nomProduit) {
        return produitRepository.findByNomProduit(nomProduit);
    }
    public void supprimerProduit(Long idProduit) {
        produitRepository.deleteById(idProduit);
    }
}













