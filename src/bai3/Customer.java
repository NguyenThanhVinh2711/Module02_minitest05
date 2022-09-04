package bai3;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int apartmentNumber;
    private int electricityMeterCode;

    public Customer() {
    }

    public Customer(String name, int apartmentNumber, int electricityMeterCode) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.electricityMeterCode = electricityMeterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getElectricityMeterCode() {
        return electricityMeterCode;
    }

    public void setElectricityMeterCode(int electricityMeterCode) {
        this.electricityMeterCode = electricityMeterCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", electricityMeterCode=" + electricityMeterCode +
                '}';
    }
}
