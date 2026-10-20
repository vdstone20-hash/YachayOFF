package service;

import org.springframework.stereotype.Service;

import entity.Leccion;
import repository.LeccionRepository;

import java.util.List;

@Service
public class LeccionService {
    private final LeccionRepository repository;
    public LeccionService(LeccionRepository repository) { this.repository = repository; }
    public List<Leccion> listar() { return repository.findAll(); }
    public Leccion guardar(Leccion dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}