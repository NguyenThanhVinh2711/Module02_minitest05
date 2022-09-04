package bai3;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import static bai3.readAndWrite.readFile;
import static bai3.readAndWrite.writeFile;

public class Manager implements Serializable {

    public static List<Receipt> receiptList = readFile("receiptFile.txt");

    public static void addReceipt(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);

        System.out.println("Nhap ten chu su dung dien:");
        String name = scannerS.nextLine();
        System.out.println("Nhap dia chi nha :");
        int apartmentNumber = scannerI.nextInt();
        System.out.println("Nhap ma cong to dien:");
        int electricityMeterCode = scannerI.nextInt();
        System.out.println("Nhap chi so dien cu:");
        int oldNumeral = scannerI.nextInt();
        System.out.println("nhap chi so dien moi:");
        int newNumeral = scannerI.nextInt();
//        System.out.println("Nhap gia tien dien:");
//        double cost = scannerD.nextDouble();

        Receipt receipt = new Receipt(name,apartmentNumber,electricityMeterCode,oldNumeral,newNumeral);
        receiptList.add(receipt);
        writeFile("receiptFile.txt",receiptList);
    }

    public static void displayReceipt(){
        for (Receipt re : receiptList
                ) {
            System.out.println(re);
        }
    }

    public static double calculateCost(){
        double cost = 0.0;
        for (int i = 0; i < receiptList.size(); i++) {
            cost = receiptList.get(i).getCost();
        }
        return cost ;
    }

    public static void menu(){
        System.out.println("1.Them ho gia dinh :   ");
        System.out.println("2.Hien thi danh sach:  ");
        System.out.println("4.Tinh tien dien cua ho gia dinh: ");
        System.out.println("0.Exit. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban:");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                addReceipt();
                break;
            case 2:
                displayReceipt();
                break;
            case 3:
                calculateCost();
                break;
            case 4:
                System.exit(0);
        }
    }
}
