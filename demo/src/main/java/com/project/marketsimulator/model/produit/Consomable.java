package com.project.marketsimulator.model.produit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Consomable extends Produit{

    @Column(nullable = false)
    private String effect;

    public Consomable() {
    }

    public Consomable(String name, String description, String effect) {
        super(name, description);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
