package com.beautyU.BeautyU.contollers;

import com.beautyU.BeautyU.dto.NegocioVistaCardDTO;
import com.beautyU.BeautyU.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
