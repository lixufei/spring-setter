package com.thoughtworks.bean.validator;

import org.apache.commons.lang3.StringUtils;

public class InputValidator {

    private static final int MAX_LENGTH = 3;

    public InputValidator() {
    }

    public boolean validInput(String a, String b) {
        return StringUtils.isNumeric(a) && StringUtils.isNumeric(b) && a.length() < MAX_LENGTH && b.length() < MAX_LENGTH;
    }
}
