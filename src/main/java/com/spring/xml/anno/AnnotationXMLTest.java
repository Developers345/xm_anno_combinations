package com.spring.xml.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationXMLTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        MessageWriter messageWriter = context.getBean("messageWriter", MessageWriter.class);
        messageWriter.writeMessage("Gireesh");

        PaymentSystem paymentSystem = context.getBean("paymentSystem",PaymentSystem.class);

        paymentSystem.processPayment();

        Person person = context.getBean("person",Person.class);
        System.out.println(person);



    }
}
