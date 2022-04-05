package com.project.marketsimulator.web;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Arme;
import com.project.marketsimulator.model.produit.Produit;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newMagasin")
    public Magasin getDefaultRelease() {
        return new Magasin();
    }

    @ModelAttribute("newArme")
    public Arme getDefaultApplication() {
        return new Arme();
    }



}
