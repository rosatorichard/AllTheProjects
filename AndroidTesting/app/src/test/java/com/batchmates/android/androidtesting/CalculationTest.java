package com.batchmates.android.androidtesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Android on 7/17/2017.
 */

public class CalculationTest {

    Calculation calc;
    Multiplication multiplication;

    @Before
    public void setup() throws Exception
    {
        multiplication= mock(Multiplication.class);

        calc=new Calculation(multiplication);
        calc.setFirst(5);
        calc.setSecond(10);
    }

    @Test
    public void testing_calculation_multiply()
    {
        Multiplication multiplication= mock(Multiplication.class);
        when(multiplication.multuiplyFloat()).thenReturn(3.0);

        assertEquals(multiplication.multuiplyFloat(),3.0);
//        when(calc.times()).thenReturn(3);
        assertEquals(calc.times(),50);
    }

    @Test
    public void mutlipleDouble()
    {
        double come=2.2;
        when(multiplication.multuiplyFloat(3.4,5.4)).thenReturn(come);
//        when(multiplication.addStuff()).thenReturn(2.0);
        assertEquals(calc.multiplyDouble(),3.4);
    }
    @Test
    public void addition()
    {
        assertEquals(calc.addition(),15);
    }

    @Test
    public void minus()
    {
        assertEquals(calc.minus(),-5);
    }

    @Test
    public void pow()
    {
        assertEquals(calc.pow(),9765625);
    }

    @Test
    public void divide()
    {
        assertEquals(calc.divide(),.5);
    }


    @After
    public void tearDown()
    {

    }
}
