package com.project.marketsimulator.web;

import com.project.marketsimulator.dao.IMemoryJPA;
import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.services.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("magasinWebCtrl")
@RequestMapping("/magasins")
public class MagasinController {

    @Autowired
    private MagasinService service;

    @GetMapping
    public String getAll(Model model){
        List<Magasin> magasins = service.getAll();
        model.addAttribute("magasins", magasins);
        return "magasins";
    }

    @PostMapping("/register")
    public String addMagasin(@ModelAttribute("newMagasin") Magasin magasin) {
        service.add(magasin);
        return "redirect:/magasins";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model) {

            Magasin magasin = service.getById(id);
            model.addAttribute("magasin", magasin);
            return "magasindetails";

    }

    @PostMapping("/delete/{id}")
    public String deleteMagasin(int id) {
        service.delete(id);
        return "redirect:/magasins";
    }

//    @PostMapping("/update")
//    public String updateMagasin(@ModelAttribute("newMagasin") Magasin magasin) {
//        service.update(magasin);
//        return "redirect:/magasins";
//    }



}
