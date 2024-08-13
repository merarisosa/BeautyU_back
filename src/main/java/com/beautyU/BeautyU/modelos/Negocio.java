package com.beautyU.BeautyU.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.json.simple.JSONObject;
import org.springframework.boot.autoconfigure.web.WebProperties;

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

    @Embedded
    private Direccion direccion;
}
