package com.beautyU.BeautyU.dto;


import com.beautyU.BeautyU.modelos.Direccion;
import com.beautyU.BeautyU.modelos.Negocio;
import org.json.simple.JSONObject;

public record NegocioAllInfoDTO(
        String nombre,
        String telefono,
        String celular,
        JSONObject social_media,
        String photo_header_url,
        Double rating,
        String website,
        String map_location,
        String descripcion,
        DireccionDTO direccionDTO
) {

    public NegocioAllInfoDTO(Negocio negocio) {
        this(negocio.getNombre(),
                negocio.getTelefono(),
                negocio.getCelular(),
                negocio.getSocial_media(),
                negocio.getPhoto_header_url(),
                negocio.getRating(),
                negocio.getWebsite(),
                negocio.getMap_location(),
                negocio.getDescripcion(),
                new DireccionDTO(
                        negocio.getDireccion().getCalle(),
                        negocio.getDireccion().getNumero(),
                        negocio.getDireccion().getColonia(),
                        negocio.getDireccion().getCp(),
                        negocio.getDireccion().getMunicipio(),
                        negocio.getDireccion().getLocalidad())
        );
    }
}
