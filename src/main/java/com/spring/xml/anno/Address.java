package com.spring.xml.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Soruce code present
@Component
public class Address {
    @Value("#{addprops.addressLine1}")
    private String addressLine1;
    @Value("#{addprops.addressLine2}")
    private String addressLine2;
    @Value("#{addprops.pincode}")
    private int pincode;
    @Value("#{addprops.city}")
    private String city;
    @Value("#{addprops.state}")
    private String state;
    @Value("#{addprops.country}")
    private String country;

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
