package com.example.backenddemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bikes")
public class Bike
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
    String BikeType ;
    String HelmetType ;

    public Bike(String id, String plateNo, String make, String model, int RateForOneDay, int RateForAdditionalOneOur, String FuelType, int SeatingCapacity, String BikeType, String HelmetType) {
        this.id = id;
        this.plateNo = plateNo;
        this.make = make;
        this.model = model;
        this.RateForOneDay = RateForOneDay;
        this.RateForAdditionalOneOur = RateForAdditionalOneOur;
        this.FuelType = FuelType;
        this.SeatingCapacity = SeatingCapacity;
        this.BikeType = BikeType;
        this.HelmetType = HelmetType;
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

    public String getBikeType() {
        return BikeType;
    }

    public void setBikeType(String bikeType) {
        BikeType = bikeType;
    }

    public String getHelmetType() {
        return HelmetType;
    }

    public void setHelmetType(String helmetType) {
        HelmetType = helmetType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "plateNo='" + plateNo + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", RateForOneDay=" + RateForOneDay +
                ", RateForAdditionalOneOur=" + RateForAdditionalOneOur +
                ", FuelType='" + FuelType + '\'' +
                ", SeatingCapacity=" + SeatingCapacity +
                ", BikeType='" + BikeType + '\'' +
                ", HelmetType='" + HelmetType + '\'' +
                '}';
    }
}
