package com.beautyU.BeautyU.modelos;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String municipio;
    private String localidad;
}
