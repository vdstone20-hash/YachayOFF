package service;

import org.springframework.stereotype.Service;

import entity.Rol;
import repository.RolRepository;

import java.util.List;

@Service
public class RolService {
    private final RolRepository repository;
    public RolService(RolRepository repository) { this.repository = repository; }
    public List<Rol> listar() { return repository.findAll(); }
    public Rol guardar(Rol dato) { return repository.save(dato); }
    public void eliminar(Long id) { repository.deleteById(id); }
}