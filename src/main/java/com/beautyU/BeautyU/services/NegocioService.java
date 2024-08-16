package com.beautyU.BeautyU.services;

import com.beautyU.BeautyU.dto.NegocioAllInfoDTO;
import com.beautyU.BeautyU.dto.NegocioVistaCardDTO;
import com.beautyU.BeautyU.modelos.Negocio;
import com.beautyU.BeautyU.repository.NegocioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NegocioService {

    @Autowired
    NegocioRepository negocioRepository;

    //Obtiene todos los negocios de la bd
    public List<NegocioVistaCardDTO> getAllNegociosCard() {
        List<Negocio> negocio = negocioRepository.findAll();
        List<NegocioVistaCardDTO> negocioVistaCardDTOList = negocio.stream()
                .map(NegocioVistaCardDTO::new)
                .toList();
        return negocioVistaCardDTOList;
    }

    //Obtiene el negocio y toda su info segun el id
    public NegocioAllInfoDTO getNegocioInfo(Long id){
        Negocio negocio = negocioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Negocio not found"));
        return new NegocioAllInfoDTO(negocio);
    }

    //Obtiene los negocios y toda su info segun la direccion id
    public List<NegocioAllInfoDTO> getNegociosByDireccion(Long id){
        List<Negocio> negocio = negocioRepository.findAllByDireccionId(id);
        if(negocio.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay negocios en esta direccion");
        } else{
            List<NegocioAllInfoDTO> negocioAllInfoDTOList = negocio.stream()
                    .map(NegocioAllInfoDTO::new)
                    .toList();
            return negocioAllInfoDTOList;
           // return NegocioAllInfoDTO(negocio);

        }
               // .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay negocios en esta direccion"));
    }

}
