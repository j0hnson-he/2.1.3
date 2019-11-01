package org.pltw.examples.makingclasses;

import junit.framework.TestCase;

/**
 * Created by Johnson on 1/7/2018.
 */

public class ArithmeticTest extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic(2,3);
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(2,3), 5);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply (2,3), 6);
    }

    public void testArithmeticSubtract() {
        assertEquals(a.subtract(2,3), -1);
    }

    public void testArithmeticDivide() {
        assertEquals(a.divide(2,3), 2/3);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
