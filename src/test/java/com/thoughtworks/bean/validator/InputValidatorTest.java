package com.thoughtworks.bean.validator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InputValidatorTest {

    private InputValidator inputValidator;

    @Before
    public void setUp() {
        inputValidator = new InputValidator();
    }

    @Test
    public void shouldPassValidation() {
        assertThat(inputValidator.validInput("12", "23"), is(true));
    }

    @Test
    public void shouldNotPassValidationWhenArgIsMoreThan100() {
        assertThat(inputValidator.validInput("100", "23"), is(false));
        assertThat(inputValidator.validInput("10", "100"), is(false));
        assertThat(inputValidator.validInput("100", "100"), is(false));
    }

    @Test
    public void shouldNotPassValidationWhenArgIsNotNumber() {
        assertThat(inputValidator.validInput("a", "23"), is(false));
        assertThat(inputValidator.validInput("10", "a"), is(false));
        assertThat(inputValidator.validInput("a", "a"), is(false));
    }
}