package com.beautyU.BeautyU.dto;

import com.beautyU.BeautyU.modelos.Servicio;
import jakarta.persistence.Column;

public record ServicioAllDTO(
        String nombre,
        String descripcion,
        String foto_servicio_url) {

    public ServicioAllDTO(Servicio servicio){
        this(servicio.getNombre(),
                servicio.getDescripcion(),
                servicio.getFoto_servicio_url());
    }
}
