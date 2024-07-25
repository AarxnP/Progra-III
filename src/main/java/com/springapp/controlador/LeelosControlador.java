package com.springapp.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeelosControlador {
    @GetMapping("/leelos")
    public String Leelos(){

        return "leelos.html";
    }
}
