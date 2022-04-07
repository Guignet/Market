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
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Produit> produits = Collections.emptyList();


    public Magasin(int id, String name, String address, List<Produit> produits) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.produits = produits;
    }

//    public Magasin(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }

    public Magasin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
