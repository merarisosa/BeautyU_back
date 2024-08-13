package com.beautyU.BeautyU.modelos;

import com.beautyU.BeautyU.dto.DireccionGeneralDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String municipio;
    private String localidad;

    public Direccion(DireccionGeneralDTO direccionGeneralDTO){
        this.localidad = direccionGeneralDTO.localidad();
        this.municipio = direccionGeneralDTO.municipio();
    }
}
