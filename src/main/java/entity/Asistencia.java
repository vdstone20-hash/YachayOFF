package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asistencias")
public class Asistencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private java.time.LocalDate fecha;
    private String estado;
    private String observacion;

    public Asistencia() {}
    public Long getId() { return id; }
    public java.time.LocalDate getFecha() { return fecha; }
    public void setFecha(java.time.LocalDate fecha) { this.fecha = fecha; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
}