package br.com.fiap.fivelife.police.service;

import br.com.fiap.fivelife.police.dto.request.GlassesDTO;
import br.com.fiap.fivelife.police.entity.Glasses;
import br.com.fiap.fivelife.police.exception.GlassesAlreadyExistsException;
import br.com.fiap.fivelife.police.exception.GlassesNotFoundException;
import br.com.fiap.fivelife.police.repository.GlassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlassesService {
    @Autowired
    private GlassesRepository glassesRepository;

    public GlassesDTO createGlasses(GlassesDTO glassesDTO) throws GlassesAlreadyExistsException {
        Glasses glassesExists = glassesRepository.findByGlassesCode(glassesDTO.getGlassesCode());

        if(glassesExists != null)
            throw new GlassesAlreadyExistsException("Óculos ja cadastrado");

        Glasses glasses = glassesDTO.convert();
        glassesRepository.save(glasses);
        return glassesDTO;
    }

    public List<GlassesDTO> getAllGlasses() {
        List<Glasses> glasses = glassesRepository.findAll();

        return GlassesDTO.convertGlassesToDTO(glasses);
    }

    public String deleteGlassesByCode(String code) throws GlassesNotFoundException {
        Glasses glassesExists = glassesRepository.findByGlassesCode(code);

        if(glassesExists == null)
            throw new GlassesNotFoundException("Oculos não existe");

        glassesRepository.delete(glassesExists);

        return "Oculos deletado com sucesso";
    }
}
