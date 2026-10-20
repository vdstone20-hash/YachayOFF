package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Asistencia;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
}