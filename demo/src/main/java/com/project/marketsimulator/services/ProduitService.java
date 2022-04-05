package com.project.marketsimulator.services;

import com.project.marketsimulator.model.produit.Produit;
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

    @Override
    public void update(Produit data) {
        dao.update(data);
    }

    @Override
    public void delete(Integer integer) {
        dao.delete(id);
    }

    @Override
    public List<Produit> getAll() {
        return dao.getAll();
    }

    @Override
    public Produit getById(Integer integer) {
        return dao.getById(id);
    }
}
