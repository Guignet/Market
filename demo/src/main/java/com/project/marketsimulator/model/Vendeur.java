package com.project.marketsimulator.model;

import javax.persistence.*;

@Entity
public class Vendeur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.ORDINAL)
    private Race race = Race.HUMAIN ;

    public Vendeur(String name, int age, Race race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public Vendeur() {
    }

    public Vendeur(int id, String name, int age, Race race) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public Vendeur(String name, int age) {
        this.name = name;
        this.age = age;
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
                ", name='" + name + '\'' +
                ", age=" + age +
                ", race=" + race +
                '}';
    }
}
