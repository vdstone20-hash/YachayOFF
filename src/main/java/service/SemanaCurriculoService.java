package service;

import org.springframework.stereotype.Service;

import entity.SemanaCurriculo;
import repository.SemanaCurriculoRepository;

import java.util.List;

@Service
public class SemanaCurriculoService {
    private final SemanaCurriculoRepository repository;
    public SemanaCurriculoService(SemanaCurriculoRepository repository) { this.repository = repository; }
    public List<SemanaCurriculo> listar() { return repository.findAll(); }
    public SemanaCurriculo guardar(SemanaCurriculo dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
