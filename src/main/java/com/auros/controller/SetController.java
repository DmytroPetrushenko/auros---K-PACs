package com.auros.controller;

import com.auros.service.KPacSetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/set")
public class SetController {
    private final KPacSetService kpacSetService;

    public SetController(KPacSetService kpacSetService) {
        this.kpacSetService = kpacSetService;
    }

    @GetMapping("/{id}")
    public String getKPacSetDetails(@PathVariable Long id, Model model) {
        model.addAttribute("kPacSet", kpacSetService.getById(id));
        return "set";
    }
}
