package entity;


import com.yachayoff.RoleName;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING) @Column(nullable = false, unique = true)
    private RoleName nombre;

    public Rol() {}
    public Rol(RoleName nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public RoleName getNombre() { return nombre; }
    public void setNombre(RoleName nombre) { this.nombre = nombre; }
}