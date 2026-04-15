package com.pluralsight;

public class CellPhone {
    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        String serialNumber= "0";
        String model="";
        String carrier="";
        String phoneNumber="";
        String owner="";
    }
    public CellPhone(String serialNumber, String model, String carrier, String phoneNumber,String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    public CellPhone(String owner,String phoneNumber){
        this.owner = owner;
        this.phoneNumber =phoneNumber;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner){
        this.owner= owner;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
    public void dial(String phoneNumberToDial){
        System.out.println(owner + "'s phone is dialing the number "+ phoneNumberToDial);
    }
    public void dial(CellPhone phone){
        dial(phone.getPhoneNumber());
    }
}

