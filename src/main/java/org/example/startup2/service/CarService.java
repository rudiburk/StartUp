package org.example.startup2.service;

import org.example.startup2.model.CarDTO;

import java.util.List;

public interface CarService {
    public List<CarDTO> selectAllCars();

    public CarDTO insertCar(CarDTO carDTO);
}
