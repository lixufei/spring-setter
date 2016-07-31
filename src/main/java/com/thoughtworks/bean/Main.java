package com.thoughtworks.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CalculatorClient calculatorClient = (CalculatorClient) context.getBean("calculatorClient");
        System.out.println(calculatorClient.add("12", "35"));
        System.out.println(calculatorClient.add("112", "35"));
        System.out.println(calculatorClient.plus("12", "35"));
        System.out.println(calculatorClient.plus("112", "35"));
        context.registerShutdownHook();
    }

}
