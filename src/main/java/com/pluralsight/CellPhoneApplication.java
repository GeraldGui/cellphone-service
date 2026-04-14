package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.print("What is the serial number? ");
        long serialNumber = myObj.nextLong();
        myObj.nextLine();

        System.out.print("What model is the phone? ");
        String model = myObj.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = myObj.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = myObj.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = myObj.nextLine();

        CellPhone phone = new CellPhone();

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        builder.append("\nSerialNumber: ").append(phone.getSerialNumber());
        builder.append("\nModel: ").append(phone.getModel());
        builder.append("\nCarrier: ").append(phone.getCarrier());
        builder.append("\nPhone number: ").append(phone.getPhoneNumber());
        builder.append("\nOwner: ").append(phone.getOwner());

        System.out.println(builder);
    }
}
