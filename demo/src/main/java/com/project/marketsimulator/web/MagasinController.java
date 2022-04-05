package com.project.marketsimulator.web;

import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.services.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("magasinWebCtrl")
@RequestMapping("/magasins")
public class MagasinController {
    @Autowired
    private MagasinService service;

    @Autowired
    private IMemoryJPA jpa;

    @GetMapping
    public String getAll(Model model){
        List<Magasin> magasins = service.getAll();
        model.addAllAttribute("magasins",magasins);
        return "magasins";
    }
}
