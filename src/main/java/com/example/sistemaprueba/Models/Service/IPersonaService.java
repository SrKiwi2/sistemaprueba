package com.example.sistemaprueba.Models.Service;

import java.util.List;

import com.example.sistemaprueba.Models.Entity.Persona;



public interface IPersonaService {
    public List<Persona> findAll(); //Muestra todos los registros
    public void save(Persona persona); //Guarda registro
    public Persona findOne(Long id); //Muestra un registro
    public void delete(Long id); //Elimina registro
}
