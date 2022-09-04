package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bai1.readAndWrite.readFile;
import static bai1.readAndWrite.writeFile;

public class Manager {

    public static List<Person> hotelList = readFile("hotelFile.txt");

    public static void addToListHotel() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);

        System.out.println("Nhap so ngay thue:");
        int numberOfRentalDays = scannerI.nextInt();

        System.out.println("Nhap loai phong:");
        int typeOfRoom = scannerI.nextInt();

        System.out.println("Gia phong :");
        double priceRoom = scannerD.nextDouble();

        System.out.println("Nhap ten khach hang:");
        String name = scannerS.nextLine();

        System.out.println("Nhap ngay thang nam sinh:");
        String dateOfBirth = scannerS.nextLine();

        System.out.println("Nhap id khach hang:");
        int id = scannerI.nextInt();

        Person person = new Person(numberOfRentalDays, typeOfRoom, priceRoom, name, dateOfBirth, id);
        hotelList.add(person);
        writeFile( "hotelFile.txt" , hotelList);
    }

    public static void deleteToListHotel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so id can tim:");
        int id = scanner.nextInt();

        for (int i = 0; i < hotelList.size(); i++) {
            if (id == hotelList.get(i).getId()) {
                hotelList.remove(hotelList.get(i));
            }
        }
    }

    public static void displayList() {
        for (Person hotel : hotelList
        ) {
            System.out.println(hotel);
        }
    }

    public static double payMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id can tinh tien");
        int id = scanner.nextInt();
        double totalMoney = 0.0;
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i) instanceof Discount){
                if (id == hotelList.get(i).getId()){
                    totalMoney = ((Discount)  hotelList.get(i)).payMoney();
                }
            }
        }
        return totalMoney;
    }

    public static void menu(){
        System.out.println("1.Them khach hang:   ");
        System.out.println("2.Hien thi danh sach khach hang:  ");
        System.out.println("3.Xoa khach hang: ");
        System.out.println("4.Tinh tien thue cua khach hang: ");
        System.out.println("0.Exit. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban:");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                addToListHotel();
                break;
            case 2:
                displayList();
                break;
            case 3:
                deleteToListHotel();
                break;
            case 4:
                payMoney();
            case 5:
                System.exit(0);
        }
    }

}
