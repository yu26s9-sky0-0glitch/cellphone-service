package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    static Scanner myScanner = new Scanner(System.in);
    static void main(){
        CellPhone cellPhone = new CellPhone();
        cellPhone.setSerialNumber(stringScanner("What is the serial number?"));
        cellPhone.setModel(stringScanner("What model is the phone?"));
        cellPhone.setCarrier(stringScanner("Who is the carrier?"));
        cellPhone.setPhoneNumber(stringScanner("What is the phone number?"));
        cellPhone.setOwner(stringScanner("Who is the owner of the phone?"));
        System.out.println("Serial Number: "+cellPhone.getSerialNumber()+"\nModel: "+cellPhone.getModel()+"\nCarrier: "+ cellPhone.getCarrier()+"\nPhone Number: "+cellPhone.getPhoneNumber()+"\nOwner: "+cellPhone.getOwner());

    }
    static String stringScanner(String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }
}
