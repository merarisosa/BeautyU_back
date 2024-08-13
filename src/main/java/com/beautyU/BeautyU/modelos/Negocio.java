package com.beautyU.BeautyU.modelos;

import com.beautyU.BeautyU.dto.DireccionGeneralDTO;
import com.beautyU.BeautyU.dto.NegocioVistaCardDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.simple.JSONObject;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    private String telefono;
    private String celular;

    @Column(columnDefinition = "json")
    private JSONObject social_media;

    @Column(columnDefinition = "text")
    private String photo_header_url;

    private Double rating;
    private String website;
    private String map_location;
    private String descripcion;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "calle", column = @Column(name = "direccion_calle")),
            @AttributeOverride(name = "numero", column = @Column(name = "direccion_numero")),
            @AttributeOverride(name = "colonia", column = @Column(name = "direccion_colonia")),
            @AttributeOverride(name = "cp", column = @Column(name = "direccion_cp")),
            @AttributeOverride(name = "municipio", column = @Column(name = "direccion_municipio")),
            @AttributeOverride(name = "localidad", column = @Column(name = "direccion_localidad"))
    })
    private Direccion direccion;

    public Negocio (NegocioVistaCardDTO negocioVistaCardDTO){
        this.nombre = negocioVistaCardDTO.nombre();
        this.photo_header_url = negocioVistaCardDTO.photo_header_url();
        this.rating = negocioVistaCardDTO.rating();
        this.direccion = new Direccion(
                new DireccionGeneralDTO(
                        negocioVistaCardDTO.direccionGeneralDTO().localidad(),
                        negocioVistaCardDTO.direccionGeneralDTO().municipio()));
    }
}
