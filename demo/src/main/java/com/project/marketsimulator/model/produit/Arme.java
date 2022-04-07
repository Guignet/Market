package com.project.marketsimulator.model.produit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Arme extends Produit{

    @Column(nullable = false)
    private int damage;

    public Arme() {
    }

    public Arme(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
