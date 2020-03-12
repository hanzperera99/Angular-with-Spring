package com.example.backenddemo.service;

import com.example.backenddemo.model.Car;
import com.example.backenddemo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService
{
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.findAll();
    }
    public Car getByplateNo(String plateNo){
        return carRepository.findByplateNo(plateNo);
    }

    public void delete(String plateNo) {
        Car car = carRepository.findByplateNo(plateNo) ;
        carRepository.delete(car);
    }
}
