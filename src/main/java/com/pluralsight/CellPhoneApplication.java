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

        //Second Phone
        CellPhone secondPhone = new CellPhone();
        System.out.println("____________________________________________");
        System.out.println("What is the serial number? ");
        int serialNumber2 = scan.nextInt();
        secondPhone.setSerialNumber(serialNumber2);
        scan.nextLine();
        System.out.println("What model is the phone? ");
        String model2 = scan.nextLine().trim();
        secondPhone.setModel(model2);
        System.out.println("Who is the carrier? ");
        String carrier2 = scan.nextLine().trim();
        secondPhone.setCarrier(carrier2);
        System.out.println("What is the phone number?");
        String phoneNumber2 = scan.nextLine().trim();
        secondPhone.setPhoneNumber(phoneNumber2);
        System.out.println("Who is the owner of the phone?");
        String owner2 = scan.nextLine().trim();
        secondPhone.setOwner(owner2);


        //Person Dialing
        firstPhone.dial("855-555-2222");
        System.out.println("____________________________________________");
        display(firstPhone);
        System.out.println("____________________________________________");
        display(secondPhone);
        System.out.println("____________________________________________");
        firstPhone.dial(secondPhone.getPhoneNumber());
        System.out.println("____________________________________________");
        secondPhone.dial(firstPhone.getPhoneNumber());

        scan.close();


    }

    public static void display(CellPhone cellphone){
        System.out.println("*** Here are the details of your phone ***");
        System.out.println("\tThe serial number is "+cellphone.getSerialNumber());
        System.out.println("\tThe model is "+cellphone.getModel());
        System.out.println("\tThe carrier is "+cellphone.getCarrier());
        System.out.println("\tThe phone number is "+cellphone.getPhoneNumber());
        System.out.println("\tThe owner is "+cellphone.getOwner());
    }
}


