package br.com.fiap.fivelife.police.controller;

import br.com.fiap.fivelife.police.entity.Suspect;
import br.com.fiap.fivelife.police.exception.SuspectNotFoundException;
import br.com.fiap.fivelife.police.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<Suspect> findAllSuspect() {
        return new ResponseEntity(reportService.findAllSuspect(), HttpStatus.OK);
    }

    @GetMapping("/suspect")
    public ResponseEntity<Suspect> findSuspectById(@RequestParam String id) {
        try {
            return new ResponseEntity(reportService.findSuspectById(id), HttpStatus.OK);
        } catch (SuspectNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
