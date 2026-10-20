package service;


import org.springframework.stereotype.Service;

import entity.Bimestre;
import repository.BimestreRepository;

import java.util.List;

@Service
public class BimestreService {
    private final BimestreRepository repository;
    public BimestreService(BimestreRepository repository) { this.repository = repository; }
    public List<Bimestre> listar() { return repository.findAll(); }
    public Bimestre guardar(Bimestre dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
