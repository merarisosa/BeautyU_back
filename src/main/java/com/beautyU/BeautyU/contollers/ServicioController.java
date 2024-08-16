package com.beautyU.BeautyU.contollers;

import com.beautyU.BeautyU.repository.ServicioRepository;
import com.beautyU.BeautyU.services.ServicioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.beautyU.BeautyU.dto.ServicioAllDTO;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @GetMapping("/{id}")
    public ResponseEntity<ServicioAllDTO> getServicioById(@Valid @PathVariable Long id){
        return ResponseEntity.ok(servicioService.getServicioById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ServicioAllDTO>> getAllServicesList(){
        return ResponseEntity.ok(servicioService.getAllServicesList());
    }
}
