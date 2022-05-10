package com.auros.controller;

import com.auros.model.KPac;
import com.auros.service.KPacService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kpacs")
public class KPacsController {

    private final KPacService kpacService;

    public KPacsController(KPacService kpacService) {
        this.kpacService = kpacService;
    }

    @GetMapping()
    public String getStart(Model model) {
        model.addAttribute("kPac", new KPac());
        return "kpacs";
    }

    @PostMapping("")
    public String create(@ModelAttribute("kPac") KPac kpac) {
        kpacService.creat(kpac);
        return "redirect:/kpacs";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        kpacService.delete(id);
        return "redirect: /kpacs";
    }

    @ModelAttribute("kPacData")
    public List<KPac> getKPacData() {
        return kpacService.getAll();
    }
}
