package com.example.backenddemo.service;

import com.example.backenddemo.model.Bike;
import com.example.backenddemo.model.Car;
import com.example.backenddemo.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getAll(){
        return bikeRepository.findAll();
    }
    public Bike getByplateNo(String plateNo){
        return bikeRepository.findByplateNo(plateNo);
    }

    public void delete(String plateNo) {
        Bike bike = bikeRepository.findByplateNo(plateNo) ;
        bikeRepository.delete(bike);
    }
}
