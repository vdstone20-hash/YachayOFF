package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "insignias")
public class Insignia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String icono;

    public Insignia() {}
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getIcono() { return icono; }
    public void setIcono(String icono) { this.icono = icono; }
}
