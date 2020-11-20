package br.com.fiap.fivelife.police.controller;

import br.com.fiap.fivelife.police.dto.request.GlassesDTO;
import br.com.fiap.fivelife.police.exception.GlassesAlreadyExistsException;
import br.com.fiap.fivelife.police.exception.GlassesNotFoundException;
import br.com.fiap.fivelife.police.service.GlassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/glasses")
public class GlassesController {
    @Autowired
    private GlassesService glassesService;

    @PostMapping
    public ResponseEntity<GlassesDTO> createGlasses(@RequestBody GlassesDTO glassesDTO) {
        try {
            return new ResponseEntity(glassesService.createGlasses(glassesDTO), HttpStatus.CREATED);
        } catch (GlassesAlreadyExistsException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<GlassesDTO> getAllGlasses() {
        return new ResponseEntity(glassesService.getAllGlasses(), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteGlassesByCode(@RequestBody GlassesDTO glassesDTO) {
        try {
            return new ResponseEntity(glassesService.deleteGlassesByCode(glassesDTO.getGlassesCode()), HttpStatus.OK);
        } catch (GlassesNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
