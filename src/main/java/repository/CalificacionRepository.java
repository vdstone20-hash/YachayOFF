package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
}