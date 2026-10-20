package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lecciones")
public class Leccion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String mundo;
    private Integer puntos;

    public Leccion() {}
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getMundo() { return mundo; }
    public void setMundo(String mundo) { this.mundo = mundo; }
    public Integer getPuntos() { return puntos; }
    public void setPuntos(Integer puntos) { this.puntos = puntos; }
}