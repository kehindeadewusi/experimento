package com.evince.experimento.experimento1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class Hallo {
    @GetMapping()
    public String getHallo() {
        
        return "Hallo someone";
    }   
}