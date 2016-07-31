package com.thoughtworks.bean.operation;

import com.thoughtworks.bean.validator.InputValidator;

public abstract class ICalculator {

    private final InputValidator inputValidator;

    protected ICalculator() {
        inputValidator = new InputValidator();
    }

    public abstract String operate(String a, String b);

    public final String add(String a, String b) {
        if (inputValidator.validInput(a, b)) {
            return operate(a, b);
        }
        return "Error";
    }

}
