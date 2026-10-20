package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "progreso_semanal")
public class ProgresoSemanal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String semana;
    private Integer puntos;
    private Integer leccionesCompletadas;

    public ProgresoSemanal() {}
    public Long getId() { return id; }
    public String getSemana() { return semana; }
    public void setSemana(String semana) { this.semana = semana; }
    public Integer getPuntos() { return puntos; }
    public void setPuntos(Integer puntos) { this.puntos = puntos; }
    public Integer getLeccionesCompletadas() { return leccionesCompletadas; }
    public void setLeccionesCompletadas(Integer leccionesCompletadas) { this.leccionesCompletadas = leccionesCompletadas; }
}