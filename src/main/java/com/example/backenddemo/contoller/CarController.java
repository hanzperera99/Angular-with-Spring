package com.example.backenddemo.contoller;

import com.example.backenddemo.model.Car;
import com.example.backenddemo.service.BikeService;
import com.example.backenddemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CarController {

    @Autowired
    private CarService carService;


    @RequestMapping("/getCar")
    public Car getCar(@RequestParam String plateNo){
        return carService.getByplateNo(plateNo);
    }

    @RequestMapping("/getAllCars")
    public List<Car> getAll(){
        return carService.getAll();
    }

    @DeleteMapping("/deleteCar/{plateNo}")
    public void delete(@PathVariable String plateNo){
        carService.delete(plateNo) ;
    }




}