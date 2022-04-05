package com.project.marketsimulator.model.produit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Arme extends Produit{
    @Column(nullable = false)
    private int degat;

    public Arme() {
    }

    public Arme(String nom, String description, int degat) {
        super(nom, description);
        this.degat = degat;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
}
