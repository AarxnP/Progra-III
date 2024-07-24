package com.springapp.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioControlador {
    @GetMapping("/index")
    public String Index(){
        return "index.html";
    }
}
