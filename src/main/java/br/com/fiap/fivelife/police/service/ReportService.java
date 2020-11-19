package br.com.fiap.fivelife.police.service;

import br.com.fiap.fivelife.police.dto.response.ReportDTO;
import br.com.fiap.fivelife.police.entity.Car;
import br.com.fiap.fivelife.police.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private CarRepository carRepository;

    public ReportDTO findCar(String carCode) {
        Car car = carRepository.getByCarCode(carCode).orElse(null);

        if(car == null) {
            return new ReportDTO(null, "Viatura não encontrada");
        }

        return new ReportDTO(car, "Viatura encontrada!");
    }

}
