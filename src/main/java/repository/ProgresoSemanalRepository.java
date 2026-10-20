package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.ProgresoSemanal;

public interface ProgresoSemanalRepository extends JpaRepository<ProgresoSemanal, Long> {
}

