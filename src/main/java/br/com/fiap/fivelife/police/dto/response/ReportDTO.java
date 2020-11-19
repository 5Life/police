package br.com.fiap.fivelife.police.dto.response;

import br.com.fiap.fivelife.police.entity.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReportDTO {
    private Car car;
    private String message;

    public ReportDTO(Car car, String message) {
        this.car = car;
        this.message = message;
    }
}
