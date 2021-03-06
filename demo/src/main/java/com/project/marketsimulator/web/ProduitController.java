package com.project.marketsimulator.web;

import com.project.marketsimulator.dao.IMemoryJPA;
import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.model.produit.Arme;
import com.project.marketsimulator.model.produit.Consomable;
import com.project.marketsimulator.model.produit.Produit;
import com.project.marketsimulator.model.produit.Protection;
import com.project.marketsimulator.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller("produitWebCtrl")
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitService service;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("produits", service.getAll());
        return "produits";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        Produit produit = service.getById(id);
        model.addAttribute("produit", produit);
        return "produitDetails";
    }

    @PostMapping("/registerArme")
    public String addArme(@ModelAttribute("newArme") Arme arme) {
        service.addArme(arme);
        return "redirect:/produits";
    }
    @PostMapping("/registerConsomable")
    public String addConsomable(@ModelAttribute("newConsomable") Consomable consomable) {
        service.addConsomable(consomable);
        return "redirect:/produits";
    }
    @PostMapping("/registerProtection")
    public String addProtection(@ModelAttribute("newProtection") Protection protection) {
        service.addProtection(protection);
        return "redirect:/produits";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduit(int id) {
        service.delete(id);
        return "redirect:/produits";
    }

//    @GetMapping("/filter")
//    public String findByName(@RequestParam("name") String name, Model model) {
//        Produit p = jpa.getProduitByName(name);
//        model.addAttribute("produit", p);
//        return "produitDetails";
//    }
//
//    @PostMapping("/register")
//    public String addRelease(@ModelAttribute("newProduit") Produit produit, HttpServletResponse response) throws IOException {
//        jpa.save(produit);
//        return "redirect:/produits";
//    }
//
//    @PostMapping("/addApp/{produitId}")
//    public String addMagasin(@PathVariable("ptoduitId") int produitId, @ModelAttribute("newApplication") Magasin magasin) throws IOException {
//        service.addMagasin(produitId, magasin);
//        return "redirect:/produits/{produitId}";
//    }
}
