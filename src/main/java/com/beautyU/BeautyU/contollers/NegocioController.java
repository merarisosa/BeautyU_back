package com.beautyU.BeautyU.contollers;

import com.beautyU.BeautyU.dto.NegocioAllInfoDTO;
import com.beautyU.BeautyU.dto.NegocioVistaCardDTO;
import com.beautyU.BeautyU.repository.NegocioRepository;
import com.beautyU.BeautyU.services.NegocioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/negocio")
public class NegocioController {

    @Autowired
    NegocioService negocioService;

    @GetMapping("/all")
    public List<NegocioVistaCardDTO> getAllNegociosCard(){
    return negocioService.getAllNegociosCard();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NegocioAllInfoDTO> getNegocioInfo(@Valid @PathVariable Long id){
        NegocioAllInfoDTO negocioAllInfoDTO = negocioService.getNegocioInfo(id);
        return ResponseEntity.ok(negocioAllInfoDTO);
    }

    @GetMapping("/direccion/{id}")
    public List<NegocioAllInfoDTO> getNegociosByDireccion(@Valid @PathVariable Long id){
        return negocioService.getNegociosByDireccion(id);
    }
}
