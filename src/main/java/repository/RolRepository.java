package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}

