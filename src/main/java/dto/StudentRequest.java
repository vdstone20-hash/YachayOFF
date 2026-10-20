package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentRequest {
    @NotBlank private String nombre;
    @Email @NotBlank private String correo;
    @NotBlank private String clave;
    private String grado;
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }
}
