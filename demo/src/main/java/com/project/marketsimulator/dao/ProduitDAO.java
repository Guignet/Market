package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.produit.Produit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitDAO implements IGenericDAO<Produit, Integer> {

    @Autowired
    private IMemoryJPA jpa;

    @Override
    public void add(Produit data) {
        jpa.save(data);
    }

    @Override
    public void update(Produit data) {
        jpa.save(data);
    }

    @Override
    public void delete(int id) {
        jpa.deleteById(id);
    }

    @Override
    public List<Produit> getAll() {
        return jpa.findAll();
    }

    @Override
    public Produit getById(int id) {
        return jpa.getById(id);
    }
}
