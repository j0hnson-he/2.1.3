package org.pltw.examples.makingclasses;

import junit.framework.TestCase;

/**
 * Created by wdumas on 2/24/2015.
 */
public class ArithmeticTest2 extends TestCase {



    @Override
    public void setUp()throws Exception{
        super.setUp();
    }

    public void testArithmeticAdd() {
        assertEquals(Arithmetic.add(2, 2), 4);
        assertEquals(Arithmetic.add(2, -5), -3);
    }

    public void testArithmeticSubtract() {
        assertEquals(Arithmetic.subtract(2, 2), 0);
        assertEquals(Arithmetic.subtract(2, -5), 7);
    }

    public void testArithmeticMultiply() {
        assertEquals(Arithmetic.multiply(2, 2), 4);
        assertEquals(Arithmetic.multiply(2, -5), -10);
    }

    public void testArithmeticDivide() {
        assertEquals(Arithmetic.divide(2, 2), 1);
        assertEquals(Arithmetic.divide(2, -5), -2/5);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}