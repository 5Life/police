package br.com.fiap.fivelife.police.service;

import br.com.fiap.fivelife.police.entity.Suspect;
import br.com.fiap.fivelife.police.exception.SuspectNotFoundException;
import br.com.fiap.fivelife.police.repository.SuspectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    private SuspectRepository suspectRepository;

    public void saveSuspect(List<Suspect> suspect) {

    }

    public List<Suspect> findAllSuspect() {
        List<Suspect> suspects = suspectRepository.findAll();

        return suspects;
    }

    public Optional<Suspect> findSuspectById(String id) throws SuspectNotFoundException {
        Optional<Suspect> suspect = suspectRepository.findById(Long.parseLong(id));

        if(suspect.isEmpty()) {
            throw new SuspectNotFoundException("Suspeito não encontrado");
        }

        return suspect;
    }
}
