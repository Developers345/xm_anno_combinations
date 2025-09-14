package com.spring.xml.anno;

import org.springframework.beans.factory.annotation.Autowired;

//No source code
public class Person {

    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
