package com.project.marketsimulator.dao;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemoryJPA extends JpaRepository<Magasin, int> {

}
