package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        CellPhone firstPhone= new CellPhone();
        System.out.println("What is the serial number? ");
        int serialNumber= scan.nextInt();
        firstPhone.setSerialNumber(serialNumber);
        scan.nextLine();
        System.out.println("What model is the phone? ");
        String model= scan.nextLine().trim();
        firstPhone.setModel(model);
        System.out.println("Who is the carrier? ");
        String carrier= scan.nextLine().trim();
        firstPhone.setCarrier(carrier);
        System.out.println("What is the phone number?");
        String phoneNumber= scan.nextLine().trim();
        firstPhone.setPhoneNumber(phoneNumber);
        System.out.println("Who is the owner of the phone?");
        String owner= scan.nextLine().trim();
        firstPhone.setOwner(owner);

        System.out.println("\n*** Here are the details of your phone ***\n");
        System.out.println("The serial number is "+firstPhone.getSerialNumber());
        System.out.println("The model is "+firstPhone.getModel());
        System.out.println("The carrier is "+firstPhone.getCarrier());
        System.out.println("The phone number is "+firstPhone.getPhoneNumber());
        System.out.println("The owner is "+firstPhone.getOwner());

        scan.close();


    }
}


