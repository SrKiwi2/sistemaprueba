package com.example.sistemaprueba.Models.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_persona;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String ci;
    private String genero;
    private String celular;
    private String direccion;
    private String fecha_nac;
    private Date f_registro;
    private Date f_modific;
    private Date f_elimin;
    private String estado_persona;
}
