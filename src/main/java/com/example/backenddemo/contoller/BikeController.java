package com.example.backenddemo.contoller;

import com.example.backenddemo.model.Bike;
import com.example.backenddemo.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @RequestMapping("/getBike")
    public Bike getBike(@RequestParam String plateNo){
        return bikeService.getByplateNo(plateNo);
    }
    @RequestMapping("/getAllBikes")
    public List<Bike> getAll(){
        return bikeService.getAll();
    }
    @DeleteMapping("/deleteBike/{plateNo}")
    public void delete(@PathVariable String plateNo){
        bikeService.delete(plateNo) ;
    }
}
