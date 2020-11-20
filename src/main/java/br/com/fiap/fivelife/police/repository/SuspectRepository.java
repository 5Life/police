package br.com.fiap.fivelife.police.repository;

import br.com.fiap.fivelife.police.entity.Suspect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuspectRepository extends JpaRepository<Suspect, Long> {

}
