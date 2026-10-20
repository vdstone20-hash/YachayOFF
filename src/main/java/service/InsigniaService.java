package service;

import org.springframework.stereotype.Service;

import entity.Insignia;
import repository.InsigniaRepository;

import java.util.List;

@Service
public class InsigniaService {
    private final InsigniaRepository repository;
    public InsigniaService(InsigniaRepository repository) { this.repository = repository; }
    public List<Insignia> listar() { return repository.findAll(); }
    public Insignia guardar(Insignia dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
