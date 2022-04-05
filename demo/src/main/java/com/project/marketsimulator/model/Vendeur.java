package com.project.marketsimulator.model;

import javax.persistence.*;

@Entity
public class Vendeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int age;
    @Enumerated(EnumType.ORDINAL)
    private Race race = Race.HUMAIN ;

    public Vendeur(String nom, int age, Race race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
    }

    public Vendeur() {
    }

    public Vendeur(int id, String nom, int age, Race race) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.race = race;
    }

    public Vendeur(String nom, int age) {
        this.nom = nom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", race=" + race +
                '}';
    }
}
