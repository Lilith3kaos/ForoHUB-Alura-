package com.alura.forohub.domain.curso;

import com.alura.forohub.domain.topico.DatosRegistroTopico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    //agregar curso al repositorio
    static void save(DatosRegistroCurso datosRegistroCurso) {
    }
    //listar cursos en base de datos
    Page<Curso> findByNombre(String nombre, Pageable paginacion);
}
