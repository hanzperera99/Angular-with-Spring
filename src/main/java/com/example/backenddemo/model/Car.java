package com.example.backenddemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cars")
public class Car
{
     @Id
     String id;
     String plateNo ;
     String make ;
     String model ;
     int RateForOneDay ;
     int RateForAdditionalOneOur ;
     String FuelType ;
     int SeatingCapacity ;
     int NumberOfAirBags ;
     int NumberOfDoors ;

    public Car(String id, String plateNo, String make, String model, int RateForOneDay, int RateForAdditionalOneOur, String FuelType, int SeatingCapacity, int NumberOfAirBags, int NumberOfDoors) {
        this.id = id;
        this.plateNo = plateNo;
        this.make = make;
        this.model = model;
        this.RateForOneDay = RateForOneDay;
        this.RateForAdditionalOneOur = RateForAdditionalOneOur;
        this.FuelType = FuelType;
        this.SeatingCapacity = SeatingCapacity;
        this.NumberOfAirBags = NumberOfAirBags;
        this.NumberOfDoors = NumberOfDoors;
    }


    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRateForOneDay() {
        return RateForOneDay;
    }

    public void setRateForOneDay(int rateForOneDay) {
        RateForOneDay = rateForOneDay;
    }

    public int getRateForAdditionalOneOur() {
        return RateForAdditionalOneOur;
    }

    public void setRateForAdditionalOneOur(int rateForAdditionalOneOur) {
        RateForAdditionalOneOur = rateForAdditionalOneOur;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        SeatingCapacity = seatingCapacity;
    }

    public int getNumberOfAirBags() {
        return NumberOfAirBags;
    }

    public void setNumberOfAirBags(int numberOfAirBags) {
        NumberOfAirBags = numberOfAirBags;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNo='" + plateNo + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", RateForOneDay=" + RateForOneDay +
                ", RateForAdditionalOneOur=" + RateForAdditionalOneOur +
                ", FuelType='" + FuelType + '\'' +
                ", SeatingCapacity=" + SeatingCapacity +
                ", NumberOfAirBags=" + NumberOfAirBags +
                ", NumberOfDoors=" + NumberOfDoors +
                '}';
    }
}
