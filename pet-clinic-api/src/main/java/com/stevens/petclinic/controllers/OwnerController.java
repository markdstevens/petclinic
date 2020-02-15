package com.stevens.petclinic.controllers;

import com.stevens.petclinic.model.Owner;
import com.stevens.petclinic.services.OwnerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/"})
    public List<Owner> listOwners() {
        return new ArrayList<>(ownerService.findAll());
    }
}
