package com.example.trainingcentersregistry.entities;

import jakarta.persistence.Embeddable;

//To accept address as object
//Lombok can be used as well to reduce boilerplate code
@Embeddable
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

    // Getters and Setters
    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
