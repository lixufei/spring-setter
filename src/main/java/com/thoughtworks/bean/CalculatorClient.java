package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.ICalculator;

public class CalculatorClient {
    private ICalculator addCalculator;
    private ICalculator plusCalculator;

    public CalculatorClient() {

    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }

    public void setAddCalculator(ICalculator addCalculator) {
        this.addCalculator = addCalculator;
    }

    public void setPlusCalculator(ICalculator plusCalculator) {
        this.plusCalculator = plusCalculator;
    }

    public void init() {
        System.out.println("calculatorClient bean init");
    }

    public void destroy() {
        System.out.println("calculatorClient bean destroy");
    }


}
