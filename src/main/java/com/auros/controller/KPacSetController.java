package com.auros.controller;

import com.auros.convertor.KPacEditor;
import com.auros.model.KPac;
import com.auros.model.KPacSet;
import com.auros.service.KPacService;
import com.auros.service.KPacSetService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sets")
public class KPacSetController {

    private final KPacService kpacService;
    private final KPacSetService kpacSetService;

    public KPacSetController(KPacService kpacService,
                             KPacSetService kpacSetService) {
        this.kpacService = kpacService;
        this.kpacSetService = kpacSetService;
    }

    @GetMapping()
    public String getStart(Model model) {
        model.addAttribute("kPacSet", new KPacSet());
        return "sets";
    }

    @PostMapping()
    public String commitForm(@ModelAttribute("kPacSet") KPacSet kpacSet) {
        kpacSet = kpacSetService.create(kpacSet);
        System.out.println(kpacSet);
        return "redirect: /sets";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        kpacSetService.delete(id);
        return "redirect:/sets";
    }

    @ModelAttribute("kPacData")
    public List<KPac> kpacData() {
        return kpacService.getAll();
    }

    @ModelAttribute("kPacSetData")
    public List<KPacSet> kpacSetsData() {
        return kpacSetService.getAll();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(KPac.class, new KPacEditor(kpacService.getAll()));
    }
}

