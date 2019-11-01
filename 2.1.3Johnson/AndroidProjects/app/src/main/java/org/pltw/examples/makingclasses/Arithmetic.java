package org.pltw.examples.makingclasses;

/**
 * Created by Johnson on 1/7/2018.
 */



public class Arithmetic {

    private static int mOperand1;
    private static int mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }
    public Arithmetic(int operand1, int operand2){
        operand2 = mOperand2;
        operand1 = mOperand1;
    }

    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }
    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    public static int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }
    public static int subtract(int operand1, int operand2) {
        return operand1 - operand2;
    }
    public static int divide(int operand1, int operand2) {
        return operand1 / operand2;
    }
}