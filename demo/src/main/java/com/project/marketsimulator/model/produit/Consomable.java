package com.project.marketsimulator.model.produit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Consomable extends Produit{
    @Column(nullable = false)
    private String effet;

    public Consomable() {
    }

    public Consomable(String nom, String description, String effet) {
        super(nom, description);
        this.effet = effet;
    }

    public String getEffet() {
        return effet;
    }

    public void setEffet(String effet) {
        this.effet = effet;
    }
}
