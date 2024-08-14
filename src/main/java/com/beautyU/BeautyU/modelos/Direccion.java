package com.beautyU.BeautyU.modelos;

import com.beautyU.BeautyU.dto.DireccionGeneralDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String municipio;
    private String localidad;

    public Direccion(DireccionGeneralDTO direccionGeneralDTO) {
        this.localidad = direccionGeneralDTO.localidad();
        this.municipio = direccionGeneralDTO.municipio();
    }
}
