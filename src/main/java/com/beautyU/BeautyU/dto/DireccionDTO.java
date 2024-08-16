package com.beautyU.BeautyU.dto;

import com.beautyU.BeautyU.modelos.Direccion;

public record DireccionDTO(
         String calle,
         String numero,
         String colonia,
         String cp,
         String municipio,
         String localidad
) {

    public DireccionDTO (Direccion direccion){
        this(direccion.getCalle(),
                direccion.getNumero(),
                direccion.getColonia(),
                direccion.getCp(),
                direccion.getMunicipio(),
                direccion.getLocalidad());
    }
}
