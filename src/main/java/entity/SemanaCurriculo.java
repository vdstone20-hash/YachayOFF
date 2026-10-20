package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "semanas_curriculo")
public class SemanaCurriculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    private String tema;
    private String grado;

    public SemanaCurriculo() {}
    public Long getId() { return id; }
    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }
}