package com.example.backenddemo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booked_vehicles")
public class Book {
     @Id
     String id ;
     String secondDate ;
     String firstDate ;
     String plateNo ;

    public Book(String secondDate, String firstDate, String plateNo) {
        this.secondDate = secondDate;
        this.firstDate = firstDate;
        this.plateNo = plateNo;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = secondDate;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "secondDate='" + secondDate + '\'' +
                ", firstDate='" + firstDate + '\'' +
                ", plateNo='" + plateNo + '\'' +
                '}';
    }
}
