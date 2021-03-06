package com.project.marketsimulator.model.produit;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1024)
    private String description;

    public Produit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Produit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
