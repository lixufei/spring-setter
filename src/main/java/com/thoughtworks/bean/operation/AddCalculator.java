package com.thoughtworks.bean.operation;

public class AddCalculator extends ICalculator {

    @Override
    public String operate(String a, String b) {
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }

    public void init() {
        System.out.println("addCalculator bean init");
    }

    public void destroy() {
        System.out.println("addCalculator bean destroy");
    }
}
