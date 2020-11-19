package br.com.fiap.fivelife.police.service;

import br.com.fiap.fivelife.police.entity.Car;
import br.com.fiap.fivelife.police.exception.CarNotFoundException;
import br.com.fiap.fivelife.police.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    private CarRepository carRepository;

    public Optional<Car> findCar(String carCode) throws CarNotFoundException {
        Optional<Car> car = carRepository.getByCarCode(carCode);

        if(car.isEmpty()) {
            throw new CarNotFoundException("Viatura não encontrada");
        }

        return car;
    }

}
