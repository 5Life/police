package br.com.fiap.fivelife.police.dto.response;

import br.com.fiap.fivelife.police.entity.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
public class ReportDTO {
    private Optional<Car> car;
    private String message;

    public ReportDTO(Optional<Car> car, String message) {
        this.car = car;
        this.message = message;
    }
}
