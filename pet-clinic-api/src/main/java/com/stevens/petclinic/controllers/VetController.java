package com.stevens.petclinic.controllers;

import com.stevens.petclinic.model.Vet;
import com.stevens.petclinic.services.VetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vets")
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/"})
    public List<Vet> listVets() {
        return new ArrayList<>(vetService.findAll());
    }
}
