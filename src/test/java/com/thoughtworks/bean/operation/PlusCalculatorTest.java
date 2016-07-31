package com.thoughtworks.bean.operation;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlusCalculatorTest {

    private PlusCalculator plusCalculator;

    @Before
    public void setUp() {
        plusCalculator = new PlusCalculator();
    }

    @Test
    public void shouldReturnPlusResult() {
        assertThat(plusCalculator.add("12", "23"), is("1223"));
    }

    @Test
    public void shouldReturnErrorWhenArgIsMoreThan100() {
        assertThat(plusCalculator.add("100", "23"), is("Error"));
        assertThat(plusCalculator.add("10", "100"), is("Error"));
        assertThat(plusCalculator.add("100", "100"), is("Error"));
    }

    @Test
    public void shouldReturnErrorWhenArgIsNotNumber() {
        assertThat(plusCalculator.add("a", "23"), is("Error"));
        assertThat(plusCalculator.add("10", "a"), is("Error"));
        assertThat(plusCalculator.add("a", "a"), is("Error"));
    }
}