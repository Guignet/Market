package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.Magasin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MagasinDAO implements IGenericDAO<Magasin, int> {

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
    public void delete(int id) {
        jpa.deleteById(id);
    }

    @Override
    public List<Magasin> getAll() {
        return jpa.findAll();
    }

    @Override
    public Magasin getById(int id) {
        return jpa.getById(id);
    }
}
