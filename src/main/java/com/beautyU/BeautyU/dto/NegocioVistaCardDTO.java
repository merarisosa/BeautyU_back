package com.beautyU.BeautyU.dto;

import com.beautyU.BeautyU.modelos.Negocio;

public record NegocioVistaCardDTO(
        String nombre,
        String photo_header_url,
        Double rating,
        DireccionGeneralDTO direccionGeneralDTO) {

    public NegocioVistaCardDTO(Negocio negocio){
        this(negocio.getNombre(),
                negocio.getPhoto_header_url(),
                negocio.getRating(),
                new DireccionGeneralDTO(
                        negocio.getDireccion().getLocalidad(),
                        negocio.getDireccion().getMunicipio()
                ));
    }
}
