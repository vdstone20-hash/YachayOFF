package service;

import org.springframework.stereotype.Service;

import entity.Asistencia;
import repository.AsistenciaRepository;

import java.util.List;

@Service
public class AsistenciaService {
    private final AsistenciaRepository repository;
    public AsistenciaService(AsistenciaRepository repository) { this.repository = repository; }
    public List<Asistencia> listar() { return repository.findAll(); }
    public Asistencia guardar(Asistencia dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
