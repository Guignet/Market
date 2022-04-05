package com.project.marketsimulator.model.produit;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

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

    public void setNom(String name) {
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
