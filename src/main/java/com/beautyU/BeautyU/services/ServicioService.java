package com.beautyU.BeautyU.services;

import com.beautyU.BeautyU.dto.ServicioAllDTO;
import com.beautyU.BeautyU.modelos.Servicio;
import com.beautyU.BeautyU.repository.ServicioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    //Obtiene un servicio por id
    public ServicioAllDTO getServicioById(Long id){
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio not found"));        return new ServicioAllDTO(servicio);
    }

    //Obtiene el listado de servicios disponibles
    public List<ServicioAllDTO> getAllServicesList(){
        List<Servicio> servicioList = servicioRepository.findAll().stream()
                .toList();

        if(servicioList.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No existen servicios registrados");
        }else{
            List <ServicioAllDTO> servicioAllDTOList =  servicioList.stream()
                    .map(servicio -> new ServicioAllDTO(
                            servicio.getNombre(),
                            servicio.getDescripcion(),
                            servicio.getFoto_servicio_url()
                    ))
                    .toList();
            return servicioAllDTOList;
        }
    }
    //Obtiene el listado de servicios disponibles para un negocio
    //Obtiene los negocios que cuentan con un servicio
}
