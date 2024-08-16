package com.beautyU.BeautyU.modelos;

import com.beautyU.BeautyU.dto.ServicioAllDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = true)
    private String descripcion;

    @Column(nullable = false)
    private Long negocio_id;

    @Column(columnDefinition = "text")
    private String foto_servicio_url;

    public Servicio(ServicioAllDTO servicioAllDTO){
        this.nombre = servicioAllDTO.nombre();
        this.descripcion = servicioAllDTO.descripcion();
        this.foto_servicio_url = servicioAllDTO.foto_servicio_url();
    }
}
