package dto;

public class ProgressResponse {
    private int puntos;
    private int leccionesCompletadas;
    public ProgressResponse() {}
    public ProgressResponse(int puntos, int leccionesCompletadas) {
        this.puntos = puntos; this.leccionesCompletadas = leccionesCompletadas;
    }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public int getLeccionesCompletadas() { return leccionesCompletadas; }
    public void setLeccionesCompletadas(int leccionesCompletadas) { this.leccionesCompletadas = leccionesCompletadas; }
}

