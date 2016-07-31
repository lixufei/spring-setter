package com.thoughtworks.bean.operation;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddCalculatorTest {

    private AddCalculator addCalculator;

    @Before
    public void setUp() {
        addCalculator = new AddCalculator();
    }

    @Test
    public void shouldReturnPlusResult() {
        assertThat(addCalculator.add("12", "23"), is("35"));
    }

    @Test
    public void shouldReturnErrorWhenArgIsMoreThan100() {
        assertThat(addCalculator.add("100", "23"), is("Error"));
        assertThat(addCalculator.add("10", "100"), is("Error"));
        assertThat(addCalculator.add("100", "100"), is("Error"));
    }

    @Test
    public void shouldReturnErrorWhenArgIsNotNumber() {
        assertThat(addCalculator.add("a", "23"), is("Error"));
        assertThat(addCalculator.add("10", "a"), is("Error"));
        assertThat(addCalculator.add("a", "a"), is("Error"));
    }

}