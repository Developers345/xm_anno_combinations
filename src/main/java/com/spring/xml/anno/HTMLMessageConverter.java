package com.spring.xml.anno;

//Source code not present
public class HTMLMessageConverter implements IMessageConverter {

    @Override
    public void convertMessage(String message) {
        System.out.println("<html>Hello"+message+"</html>");
    }
}
