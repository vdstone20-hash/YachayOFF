package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Bimestre;

public interface BimestreRepository extends JpaRepository<Bimestre, Long> {
}

