package br.com.fiap.fivelife.police.controller;

import br.com.fiap.fivelife.police.dto.response.ReportDTO;
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
    public ResponseEntity<ReportDTO> hello(@RequestParam String carCode) {
        return new ResponseEntity<>(reportService.findCar(carCode), HttpStatus.OK);
    }
}