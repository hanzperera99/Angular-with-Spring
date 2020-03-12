package com.example.backenddemo.repository;

//import com.example.backenddemo.model.Bike;
import com.example.backenddemo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedVehicleRepository extends MongoRepository<Book, String>{
    public Book findByplateNo(String plateNo);
}
