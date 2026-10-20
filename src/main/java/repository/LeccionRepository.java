package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Leccion;

public interface LeccionRepository extends JpaRepository<Leccion, Long> {
}
