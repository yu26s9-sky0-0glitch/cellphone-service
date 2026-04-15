package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    static Scanner myScanner = new Scanner(System.in);
    static void main(){
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        setSerialNumber(stringScanner("What is the serial number?"),cellPhone1);
        setModel(stringScanner("What model is the phone?"),cellPhone1);
        setCarrier(stringScanner("Who is the carrier?"),cellPhone1);
        setPhoneNumber(stringScanner("What is the phone number?"),cellPhone1);
        setOwner(stringScanner("Who is the owner of the phone?"),cellPhone1);
        setOwner("Husna",cellPhone2);
        setPhoneNumber("111-222-333",cellPhone2);
        cellPhone1.dial(cellPhone2);
        display(cellPhone1);
        display(cellPhone2);


    }
    static String stringScanner(String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }
    static void setSerialNumber(String input,CellPhone cellPhone){
        cellPhone.setSerialNumber(input);

    }
    static void setModel(String input,CellPhone cellPhone){
        cellPhone.setModel(input);

    }
    static void setCarrier(String input,CellPhone cellPhone){
        cellPhone.setCarrier(input);
    }
    static void setPhoneNumber(String input,CellPhone cellPhone){
        cellPhone.setPhoneNumber(input);
    }
    static void setOwner(String input,CellPhone cellPhone){
        cellPhone.setOwner(input);
    }
    static void display(CellPhone cellPhone){
        System.out.println("Serial Number: "+cellPhone.getSerialNumber());
        System.out.println("Model: "+cellPhone.getModel());
        System.out.println("Carrier: "+ cellPhone.getCarrier());
        System.out.println("Phone Number: "+cellPhone.getPhoneNumber());
        System.out.println("Owner: "+cellPhone.getOwner());
    }

}
