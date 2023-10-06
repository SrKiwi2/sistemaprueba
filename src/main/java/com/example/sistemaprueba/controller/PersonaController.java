package com.example.sistemaprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sistemaprueba.Models.Entity.Persona;
import com.example.sistemaprueba.Models.Service.IPersonaService;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;
    
    @GetMapping(value = "/formRegistro")
    public String registroPersona(@Validated Persona persona, Model model){
        
        model.addAttribute("persona", new Persona());
        model.addAttribute("personas", personaService.findAll());

        return "formularios/formPersona";
    }

    /* GUARDAR */

    @PostMapping(value = "/guardarPersona")
    public String RegistrarPersona(@Validated Persona persona){
        persona.setEstado_persona("A");
        personaService.save(persona);
        return "redirect:/formRegistro";
    }

    /* eliminar */
    
    @RequestMapping(value = "/eliminarPersona/{id_persona}")
    public String eliminarPersona(@PathVariable("id_persona")Long id_persona){
        Persona persona = personaService.findOne(id_persona);
        persona.setEstado_persona("X");
        personaService.save(persona);
        return "redirect:/ListaPersona";
        
    }

    /* Editar */

    @RequestMapping(value = "/editarPersona/{id_persona}")
    public String editarPersona(@PathVariable("id_persona")Long id_persona, Model model){
        Persona persona = personaService.findOne(id_persona);
        model.addAttribute("persona", persona);
        return "formularios/formPersona";
    }

    /* Lista */
    
    @GetMapping(value = "/ListaPersona")
    public String listarPersona (Model model){
        model.addAttribute("personas", personaService.findAll());
        return "listas/listasP";
    }
}
