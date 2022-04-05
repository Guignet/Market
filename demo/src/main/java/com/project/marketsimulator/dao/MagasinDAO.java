package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Produit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MagasinDAO implements IGenericDAO<Magasin, Integer> {

    @Autowired
    private IMemoryJPA jpa;

    @Override
    public void add(Magasin data) {

        jpa.save(data);
    }

    @Override
    public void update(Magasin data) {

        jpa.save(data);
    }

    @Override
    public void delete(Integer id) {
        jpa.deleteById(id);
    }

    @Override
    public List<Magasin> getAll() {

        return jpa.findAll();
    }

    @Override
    public Magasin getById(Integer id) {
        return jpa.getById(id);
    }

    public void addProduit(Integer id, Produit prod){
        Magasin m = jpa.getById(id);
        m.getProduits().add(prod);
        jpa.save(m);
    }

}
