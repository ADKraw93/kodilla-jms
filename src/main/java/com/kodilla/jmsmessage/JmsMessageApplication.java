package com.kodilla.jmsmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class JmsMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsMessageApplication.class, args);
    }

}
