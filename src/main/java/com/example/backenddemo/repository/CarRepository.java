package com.example.backenddemo.repository;

import com.example.backenddemo.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
    public Car findByplateNo(String plateNumber);
    public List<Car> findByRateForOneDay(int RateForOneDay);

}
