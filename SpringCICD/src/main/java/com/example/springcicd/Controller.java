package com.example.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "Esta es la página principal";
    }

    @GetMapping("/nombre")
    public String nombre() {
        return "SpringBoot CI/CD César Díaz Ufano Sánchez";
    }
}
