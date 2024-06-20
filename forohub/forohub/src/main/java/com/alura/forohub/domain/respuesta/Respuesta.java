package com.alura.forohub.domain.respuesta;

import com.alura.forohub.domain.topico.Topico;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mensaje")
    @Size(min = 20, max = 255, message = "El mensaje debe tener entre 20 y 255 caracteres")
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "topico_id", referencedColumnName = "id")
    private Topico topico;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "autor")
    private String autor;

    public Respuesta(DatosRegistroRespuesta datosRegistroRespuesta, Topico topico) {
        this.mensaje = datosRegistroRespuesta.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.autor = datosRegistroRespuesta.autor();
        this.topico = topico;
    }
}
