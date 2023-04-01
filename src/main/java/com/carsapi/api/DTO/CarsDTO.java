package com.carsapi.api.DTO;

public record CarsDTO(
        String modelo,
        String fabricante,
        String dataFabricacao,
        Double valor,
        Number anoModelo) {

}
