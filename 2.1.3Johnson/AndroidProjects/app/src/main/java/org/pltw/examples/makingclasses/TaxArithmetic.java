package org.pltw.examples.makingclasses;

/**
 * Created by Johnson on 1/7/2018.
 */

public class TaxArithmetic extends Arithmetic {



        public TaxArithmetic(int operand1, int operand2){
            super(operand1, operand2);
        }

        public double calculateTax(double purchaseAmt, double taxRate){
            return purchaseAmt *(taxRate/100);

        }
        public double calculateTax(double taxRate) {
            int purchaseAmount = add(5, 10);
            return purchaseAmount *(taxRate/100);
        }

    }