package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IMemoryJPA extends JpaRepository<Magasin, Integer> {
    @Query("select r from Magasin r where r.name = :name")
    Magasin getMagasinByName(@Param("name") String name);
}
