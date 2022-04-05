package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.produit.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProduitDAO implements IGenericDAO<Produit, Integer> {

    @Autowired
    private IMemoryJPA jpa;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Produit data) {
        entityManager.persist(data);
    }

    @Override
    public void update(Produit data) {
        entityManager.merge(data);
    }

    @Override
    public void delete(Integer integer) {
        entityManager.remove(getById(integer));
    }

    @Override
    public List<Produit> getAll() {
        TypedQuery<Produit> query = entityManager.createQuery(
                "select a from Produit a", Produit.class
        );
        return query.getResultList();
    }

    @Override
    public Produit getById(Integer integer) {
        return entityManager.find(Produit.class, integer);
    }


}
