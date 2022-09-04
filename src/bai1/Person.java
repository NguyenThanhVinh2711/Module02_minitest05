package bai1;

import java.io.Serializable;

public class Person extends Hotel implements Discount,Serializable {
    private String name;
    private String dateOfBirth;
    private int id;

    public Person(){
    }

    public Person (String name,String dateOfBirth,int id){
        this.name= name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public Person(int numberOfRentalDays, int typeOfRoom, double priceRoom, String name, String dateOfBirth, int id) {
        super(numberOfRentalDays,typeOfRoom,priceRoom);
        this.name= name;
        this.dateOfBirth= dateOfBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  super.toString() + "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public double payMoney() {
        double totalMoney = getNumberOfRentalDays()*getPriceRoom();
        return totalMoney;
    }
}
