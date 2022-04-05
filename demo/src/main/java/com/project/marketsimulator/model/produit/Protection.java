package com.project.marketsimulator.model.produit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Protection extends Produit{
    @Column(nullable = false)
    private int defense;

    public Protection() {
    }

    public Protection(String nom, String description, int defense) {
        super(nom, description);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
