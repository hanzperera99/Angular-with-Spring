package com.example.backenddemo.service;


import com.example.backenddemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backenddemo.repository.BookedVehicleRepository ;

import java.util.List;

@Service
public class BookedVehicleService {

    @Autowired
    private BookedVehicleRepository bookedVehicleRepository ;

    public List<Book> getAll(){
        return bookedVehicleRepository.findAll() ;
    }

    public Book getByplateNo(String plateNo) {
        return bookedVehicleRepository.findByplateNo(plateNo) ;
    }

    public Book save(Book schedule){
        return bookedVehicleRepository.save(schedule) ;
    }
}
