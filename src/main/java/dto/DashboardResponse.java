package dto;


public class DashboardResponse {
    private long totalEstudiantes;
    private long totalLecciones;
    public DashboardResponse() {}
    public DashboardResponse(long totalEstudiantes, long totalLecciones) {
        this.totalEstudiantes = totalEstudiantes; this.totalLecciones = totalLecciones;
    }
    public long getTotalEstudiantes() { return totalEstudiantes; }
    public void setTotalEstudiantes(long totalEstudiantes) { this.totalEstudiantes = totalEstudiantes; }
    public long getTotalLecciones() { return totalLecciones; }
    public void setTotalLecciones(long totalLecciones) { this.totalLecciones = totalLecciones; }
}