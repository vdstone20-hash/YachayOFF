package dto;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank private String correo;
    @NotBlank private String clave;
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
}
