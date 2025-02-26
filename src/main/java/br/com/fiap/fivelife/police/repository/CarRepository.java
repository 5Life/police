package br.com.fiap.fivelife.police.repository;

import br.com.fiap.fivelife.police.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> getByCarCode(String carCode);
}
