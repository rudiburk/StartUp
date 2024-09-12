package org.example.startup2.dao;

import org.example.startup2.model.CarDTO;

import java.util.List;

public interface CarDao {

    public List<CarDTO> selectAllCars();

    public CarDTO insertCar(CarDTO carDTO);

}
