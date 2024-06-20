package com.alura.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

        static void save(DatosRegistroTopico datosRegistroTopico) {
        }

        Page<DatosRegistroTopico> findAllById(Long id,Pageable paginacion);

        Page<Topico> findByActivoTrue(Pageable paginacion);




}
