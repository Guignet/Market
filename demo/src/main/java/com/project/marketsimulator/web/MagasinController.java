package com.project.marketsimulator.web;

<<<<<<< HEAD
import com.project.marketsimulator.dao.IMemoryJPA;
=======
>>>>>>> ba478c2 (Starting Controller)
import com.project.marketsimulator.model.Magasin;
import com.project.marketsimulator.services.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
=======
>>>>>>> ba478c2 (Starting Controller)
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
<<<<<<< HEAD
        model.addAttribute("magasins",magasins);
=======
        model.addAllAttribute("magasins",magasins);
>>>>>>> ba478c2 (Starting Controller)
        return "magasins";
    }
}
