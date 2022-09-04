package bai1;

import java.io.Serializable;

public abstract class Hotel implements Serializable {
    private int numberOfRentalDays;
    private int typeOfRoom;
    private double priceRoom;

    public Hotel() {
    }

    public Hotel(int numberOfRentalDays, int typeOfRoom, double priceRoom) {
        this.numberOfRentalDays = numberOfRentalDays;
        this.typeOfRoom = typeOfRoom;
        this.priceRoom = priceRoom;
    }

    public int getNumberOfRentalDays() {
        return numberOfRentalDays;
    }

    public void setNumberOfRentalDays(int numberOfRentalDays) {
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public int getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(int typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    public abstract int getId();

    @Override
    public String toString() {
        return super.toString() + "Hotel{" +
                "numberOfRentalDays=" + numberOfRentalDays +
                ", typeOfRoom=" + typeOfRoom +
                ", priceRoom=" + priceRoom +
                '}';
    }
}
