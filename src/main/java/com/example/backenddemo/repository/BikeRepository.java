package com.example.backenddemo.repository;

import com.example.backenddemo.model.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BikeRepository extends MongoRepository<Bike, String> {
    public Bike findByplateNo(String plateNo);
    public List<Bike> findByRateForOneDay(int RateForOneDay);
}

