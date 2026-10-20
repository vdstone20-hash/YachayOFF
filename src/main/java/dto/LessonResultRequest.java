package dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class LessonResultRequest {
    @NotNull private Long leccionId;
    @Min(0) private int puntos;
    public Long getLeccionId() { return leccionId; }
    public void setLeccionId(Long leccionId) { this.leccionId = leccionId; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
}
