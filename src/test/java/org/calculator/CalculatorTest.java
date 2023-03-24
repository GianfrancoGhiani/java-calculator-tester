package org.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        Assertions.assertEquals((float) 5, Calculator.add(((float) 3.5), (float) 1.5 ));
    }

    @Test
    void subtract() {
        Assertions.assertEquals((float) 2, Calculator.subtract(((float) 3.5), (float) 1.5 ));
    }

    @Test
    void divide() {
        Assertions.assertEquals((float) 3, Calculator.divide((float) 9.9, (float) 3.3));
        Assertions.assertThrows(IllegalArgumentException.class, ()->Calculator.divide((float) 9.9, (float) 0));
        Assertions.assertEquals((float) 0, Calculator.divide((float) 0, (float) 3.3));

    }

    @Test
    void multiply() {
        Assertions.assertEquals((float) 6.6, Calculator.multiply((float) 2, (float) 3.3));

    }
}