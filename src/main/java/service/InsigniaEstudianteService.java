package service;

import org.springframework.stereotype.Service;

import entity.InsigniaEstudiante;
import repository.InsigniaEstudianteRepository;

import java.util.List;

@Service
public class InsigniaEstudianteService {
    private final InsigniaEstudianteRepository repository;
    public InsigniaEstudianteService(InsigniaEstudianteRepository repository) { this.repository = repository; }
    public List<InsigniaEstudiante> listar() { return repository.findAll(); }
    public InsigniaEstudiante guardar(InsigniaEstudiante dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
