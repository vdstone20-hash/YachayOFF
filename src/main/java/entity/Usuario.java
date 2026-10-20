package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nombre;
    @Column(nullable = false, unique = true) @Email @NotBlank
    private String correo;
    @Column(nullable = false) private String clave;
    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private com.yachayoff.RoleName rol = com.yachayoff.RoleName.ESTUDIANTE;
    private String grado;
    private boolean activo = true;

    public Usuario() {}
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public com.yachayoff.RoleName getRol() { return rol; }
    public void setRol(com.yachayoff.RoleName rol) { this.rol = rol; }
    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public void setRol(String administrador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRol'");
    }
}

