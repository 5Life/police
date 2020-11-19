package br.com.fiap.fivelife.police.controller;

import br.com.fiap.fivelife.police.dto.response.ReportDTO;
import br.com.fiap.fivelife.police.exception.CarNotFoundException;
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
    public ResponseEntity<ReportDTO> findCar(@RequestParam String carCode) {
        try {
            return new ResponseEntity<>(
                new ReportDTO(reportService.findCar(carCode), "Viatura encontrada!"),
                HttpStatus.OK
            );
        } catch (CarNotFoundException e) {
            return new ResponseEntity<>(
                new ReportDTO(null, e.getMessage()),
                HttpStatus.BAD_REQUEST
            );
        }
    }
}