package com.project.marketsimulator.model;

import com.project.marketsimulator.model.produit.Produit;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String adresse;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Produit> produits = Collections.emptyList();
    @OneToOne
    private Vendeur owner;
    public Magasin(int id, String nom, String adresse, List<Produit> produits) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.produits = produits;
    }

    public Magasin(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public Magasin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    public void addProduit(Produit p){
        produits.add(p);
    }
}
