package service;

import org.springframework.stereotype.Service;

import entity.ProgresoSemanal;
import repository.ProgresoSemanalRepository;

import java.util.List;

@Service
public class ProgresoSemanalService {
    private final ProgresoSemanalRepository repository;
    public ProgresoSemanalService(ProgresoSemanalRepository repository) { this.repository = repository; }
    public List<ProgresoSemanal> listar() { return repository.findAll(); }
    public ProgresoSemanal guardar(ProgresoSemanal dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
