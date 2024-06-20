package com.alura.forohub.domain.respuesta;

import com.alura.forohub.domain.curso.DatosRegistroCurso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    //listar respuestas en base de datos
    Page<Respuesta> findByTopico_id(Long topicoId, Pageable pageable);


}
