package com.example.backenddemo.contoller;

import com.example.backenddemo.model.Book;
import com.example.backenddemo.service.BookedVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class BookedVehicleController {

    @Autowired
    private BookedVehicleService bookedVehicleService ;

    @RequestMapping("/getBookedItem")
    public Book getSchedule (@RequestParam String plateNo){
        return bookedVehicleService.getByplateNo(plateNo) ;
    }

    @RequestMapping("/getAllBookedItem")
    public List<Book> getAll(){
        return bookedVehicleService.getAll();
    }

    @PostMapping("/addBook")
    public Book saveBook(@RequestBody Book book){
        return bookedVehicleService.save(book) ;
    }
}
