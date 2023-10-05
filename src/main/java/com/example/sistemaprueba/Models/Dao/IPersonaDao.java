package com.example.sistemaprueba.Models.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.sistemaprueba.Models.Entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
