package com.beautyU.BeautyU.dto;

import com.beautyU.BeautyU.modelos.Direccion;
import com.beautyU.BeautyU.modelos.Negocio;

public record DireccionGeneralDTO(
        String localidad,
        String municipio
) {

    public DireccionGeneralDTO(String localidad, String municipio) {
        this.localidad = localidad;
        this.municipio = municipio;
    }
   /* public DireccionGeneralDTO (Negocio negocio){
        this(negocio.getDireccion().getLocalidad(),
                negocio.getDireccion().getMunicipio());
    }*/
}
