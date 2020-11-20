package br.com.fiap.fivelife.police.controller;

import br.com.fiap.fivelife.police.dto.response.AuthDTO;
import br.com.fiap.fivelife.police.exception.CarNotFoundException;
import br.com.fiap.fivelife.police.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping
    public ResponseEntity<AuthDTO> findCar(@RequestParam String carCode) {
        try {
            return new ResponseEntity<>(
                new AuthDTO(authService.findCar(carCode), "Viatura encontrada!"),
                HttpStatus.OK
            );
        } catch (CarNotFoundException e) {
            return new ResponseEntity<>(
                new AuthDTO(null, e.getMessage()),
                HttpStatus.BAD_REQUEST
            );
        }
    }
}