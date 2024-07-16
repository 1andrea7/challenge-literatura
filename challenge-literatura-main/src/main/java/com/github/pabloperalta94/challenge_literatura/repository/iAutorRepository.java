package com.github.pabloperalta94.challenge_literatura.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.github.pabloperalta94.challenge_literatura.models.Autor;

import java.util.List;
import java.util.Optional;

public interface iAutorRepository extends JpaRepository<Autor,Long> {

    List<Autor> findAll();


    List<Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int anioBuscado, int anioBuscado1);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}
