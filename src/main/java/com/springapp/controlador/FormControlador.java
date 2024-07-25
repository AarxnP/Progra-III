package com.springapp.controlador;

import com.springapp.Entidad.Autor;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormControlador {
    @GetMapping("/formulario")
    public String Formularios(Model model){
        model.addAttribute("autor",new Autor());
        return "Autor/formulario.html";
    }
    @PostMapping("/registrarAutor")
    public String registrarAutor(@Valid @ModelAttribute Autor autor, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/Autor/formulario";
        } else {
            return "/Autor/Registro_Exitoso";
        }
    }
}