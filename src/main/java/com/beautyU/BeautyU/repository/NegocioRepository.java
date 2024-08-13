package com.beautyU.BeautyU.repository;

import com.beautyU.BeautyU.modelos.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NegocioRepository extends JpaRepository<Negocio, Long>{

}
