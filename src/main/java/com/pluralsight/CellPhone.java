package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public void setSerialNumber(int serialNumber) {
        if (serialNumber >= 1000000 && serialNumber <= 9999999) {
            this.serialNumber = serialNumber;
        }
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }
    public void dial(String phoneNumber){
        System.out.println(this.getOwner()+"'s phone is calling "+ phoneNumber);
    }
}
