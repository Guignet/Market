package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.produit.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProduitJPA extends JpaRepository<Produit, Long> {

    @Query("select p from Produit p where p.nom = :name")
    Produit getProduitByName(@Param("name") String name);
}
