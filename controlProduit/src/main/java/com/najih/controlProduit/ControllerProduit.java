package com.najih.controlProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ControllerProduit {

    @Autowired
    private ServiceProduit serviceProduit;

    @PostMapping
    public Produit ajouterProduit(@RequestBody Produit produit) {
        return serviceProduit.ajouterProduit(produit);
    }

    @GetMapping
    public List<Produit> consulterTousLesProduits() {
        return serviceProduit.consulterTousLesProduits();
    }

    @GetMapping
    public Produit rechercherProduitParId(@PathVariable Long idProduit) {
        return serviceProduit.rechercherProduitParId(idProduit)
                .orElseThrow(() -> new RuntimeException("Produit introuvable"));
    }

    @GetMapping
    public List<Produit> rechercherProduitParNom(@RequestParam String nom) {
        return serviceProduit.rechercherProduitParNom(nom);
    }

    @PutMapping
    public Produit mettreAJourProduit(@PathVariable Long idProduit, @RequestBody Produit produit) {
        return serviceProduit.mettreAJourProduit(idProduit, produit);
    }

    @DeleteMapping
    public void supprimerProduit(@PathVariable Long idProduit) {
        serviceProduit.supprimerProduit(idProduit);
    }
}