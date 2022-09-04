package bai3;

import java.io.Serializable;

public class Receipt extends Customer implements Serializable {

    private int oldNumeral;
    private int newNumeral;
//    private double cost ;

    public Receipt() {
    }

    public Receipt(String name, int apartmentNumber, int electricityMeterCode, int oldNumeral, int newNumeral) {
        super(name,apartmentNumber,electricityMeterCode);
        this.oldNumeral= oldNumeral;
        this.newNumeral = newNumeral;
//        this.cost = cost;
    }

    public int getOldNumeral() {
        return oldNumeral;
    }

    public void setOldNumeral(int oldNumeral) {
        this.oldNumeral = oldNumeral;
    }

    public int getNewNumeral() {
        return newNumeral;
    }

    public void setNewNumeral(int newNumeral) {
        this.newNumeral = newNumeral;
    }

    public double getCost() {
        return (newNumeral - oldNumeral)*750 ;
    }



    @Override
    public String toString() {
        return toString() + "Receipt{" +
                "oldNumeral=" + oldNumeral +
                ", newNumeral=" + newNumeral +
                '}';
    }
}
