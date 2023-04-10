package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumbersTest {

    @Test
    public void sum() {
        TestNumbers object = new TestNumbers();
        int actual = object.sum(10);
        int expected = 45;
        assertEquals(expected, actual);
    }
}