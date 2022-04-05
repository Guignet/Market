package com.project.marketsimulator.services;

import com.project.marketsimulator.dao.MagasinDAO;
import com.project.marketsimulator.model.Magasin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagasinService implements IGenericService<Magasin,Integer>{

    @Autowired
    private MagasinDAO dao;

    @Override
    public void add(Magasin data) {
    dao.add(data);
    }

    @Override
    public void update(Magasin data) {
    dao.update(data);
    }

    @Override
    public void delete(Integer id) {
    dao.delete(id);
    }

    @Override
    public List<Magasin> getAll() {
        return dao.getAll();
    }

    @Override
    public Magasin getById(Integer id) {
        return dao.getById(id);
    }
}
