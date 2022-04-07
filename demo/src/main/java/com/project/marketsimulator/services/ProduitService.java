package com.project.marketsimulator.services;

import com.project.marketsimulator.dao.ProduitDAO;
import com.project.marketsimulator.model.produit.Arme;
import com.project.marketsimulator.model.produit.Consomable;
import com.project.marketsimulator.model.produit.Produit;
import com.project.marketsimulator.model.produit.Protection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IGenericService<Produit,Integer> {
    @Autowired
    private ProduitDAO dao;

    @Override
    public void add(Produit data) {
        dao.add(data);
    }

    public void addArme(Arme data) {
        dao.add(data);
    }
    public void addConsomable(Consomable data) {
        dao.add(data);
    }
    public void addProtection(Protection data) {
        dao.add(data);
    }

    @Override
    public void update(Produit data) {
        dao.update(data);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Override
    public List<Produit> getAll() {
        return dao.getAll();
    }

    @Override
    public Produit getById(Integer id) {
        return dao.getById(id);
    }
}
