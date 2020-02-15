package com.stevens.petclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String index() {
        return "Hello, World!";
    }
}
