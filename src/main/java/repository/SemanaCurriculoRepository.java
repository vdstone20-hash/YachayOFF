package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.SemanaCurriculo;

public interface SemanaCurriculoRepository extends JpaRepository<SemanaCurriculo, Long> {
}