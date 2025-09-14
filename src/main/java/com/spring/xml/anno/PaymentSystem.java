package com.spring.xml.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//Source code present
@Controller
public class PaymentSystem {

    @Autowired
    private Payment payment;

    public void processPayment() {
        System.out.println("payment processing..");
    }
}
