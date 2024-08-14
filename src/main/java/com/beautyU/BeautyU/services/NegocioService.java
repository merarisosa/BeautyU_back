package com.beautyU.BeautyU.services;

import com.beautyU.BeautyU.dto.NegocioVistaCardDTO;
import com.beautyU.BeautyU.modelos.Negocio;
import com.beautyU.BeautyU.repository.NegocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioService {

    @Autowired
    NegocioRepository negocioRepository;

    public List<NegocioVistaCardDTO> getAllNegociosCard() {
        List<Negocio> negocios = negocioRepository.findAll();
        negocios.forEach(negocio -> {
            System.out.println(negocio.getNombre());
            System.out.println(negocio.getDireccion().getLocalidad());
        });


       /* List<Negocio> negocio = negocioRepository.findAll();
        List<NegocioVistaCardDTO> negocioVistaCardDTOList = negocio.stream()
                .map(NegocioVistaCardDTO::new)
                .toList();
        return negocioVistaCardDTOList;*/
        return null;
    }


}
