package org.example.startup2.service.impl;

import org.example.startup2.dao.CarDao;
import org.example.startup2.dao.UserDao;
import org.example.startup2.model.CarDTO;
import org.example.startup2.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<CarDTO> selectAllCars() {
        return carDao.selectAllCars();
    }

    @Override
    public CarDTO insertCar(CarDTO carDTO) {
        return carDao.insertCar(carDTO);
    }
}
