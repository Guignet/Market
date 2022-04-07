package com.project.marketsimulator.web;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Arme;
import com.project.marketsimulator.model.produit.Consomable;
import com.project.marketsimulator.model.produit.Produit;
import com.project.marketsimulator.model.produit.Protection;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newMagasin")
    public Magasin getDefaultMagasin() {
        return new Magasin();
    }


    @ModelAttribute("newArme")
    public Arme getDefaultArme() {
        return new Arme();
    }

    @ModelAttribute("newConsomable")
    public Consomable getDefaultConsomable() {
        return new Consomable();
    }

    @ModelAttribute("newProtection")
    public Protection getDefaultProtection() {
        return new Protection();
    }


}
