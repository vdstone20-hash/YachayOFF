package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "calificaciones")
public class Calificacion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String curso;
    private Double nota;
    private java.time.LocalDate fecha;

    public Calificacion() {}
    public Long getId() { return id; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }
    public java.time.LocalDate getFecha() { return fecha; }
    public void setFecha(java.time.LocalDate fecha) { this.fecha = fecha; }
}
