package com.spring.xml.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Source code is present
@Component
public class MessageWriter {

    @Autowired
    private IMessageConverter messageConverter;

    public void writeMessage(String message) {

        messageConverter.convertMessage(message);
    }

}
