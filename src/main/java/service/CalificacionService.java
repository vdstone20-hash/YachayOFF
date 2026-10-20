package service;

import org.springframework.stereotype.Service;

import entity.Calificacion;
import repository.CalificacionRepository;

import java.util.List;

@Service
public class CalificacionService {
    private final CalificacionRepository repository;
    public CalificacionService(CalificacionRepository repository) { this.repository = repository; }
    public List<Calificacion> listar() { return repository.findAll(); }
    public Calificacion guardar(Calificacion dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}