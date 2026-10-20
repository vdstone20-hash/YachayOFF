package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "insignias_estudiante")
public class InsigniaEstudiante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private java.time.LocalDate fechaObtencion;

    public InsigniaEstudiante() {}
    public Long getId() { return id; }
    public java.time.LocalDate getFechaObtencion() { return fechaObtencion; }
    public void setFechaObtencion(java.time.LocalDate fechaObtencion) { this.fechaObtencion = fechaObtencion; }
}
