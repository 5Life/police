package br.com.fiap.fivelife.police.repository;

import br.com.fiap.fivelife.police.entity.Glasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlassesRepository extends JpaRepository<Glasses, Long> {
    Glasses findByGlassesCode(String code);
}
