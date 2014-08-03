package com.mrcodeninja.java8.lambda;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberAdderTest {
    @Test
    public void addsNumbers() {
        NumberAdder adder = (number1, number2) -> number1 + number2;

        Number sum = adder.add(1, 2);

        assertThat(sum, is(3));
    }
}
