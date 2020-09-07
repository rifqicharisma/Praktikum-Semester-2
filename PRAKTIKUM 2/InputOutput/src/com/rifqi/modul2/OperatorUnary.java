package com.rifqi.modul2;

public class OperatorUnary {
    public static void main(String[] args) {
        // value yang diberikan operator ini adalah positif
        System.out.println("Unary Operator Plus");
        int firstValue = 5;
        int result = +firstValue;
        System.out.println("Result of +5 = " + result);
        System.out.println();
        // value yang diberikan operator ini adalah minus
        System.out.println("Unary Operator Minus");
        int firstValue2 = 5;
        firstValue2 = -firstValue2;
        System.out.println("Result of -5 = " + firstValue2);
        System.out.println();
        // memberikan penambahan nilai sebesar 1 point
        System.out.println("Increment Operator");
        int firstValue3 = 5;
        firstValue3++;
        System.out.println("Result of 5++ = " + firstValue3);
        System.out.println();
        // memberikan pengurangan nilai sebesar 1 point
        System.out.println("Decrement Operator");
        int firstValue4 = 5;
        firstValue4--;
        System.out.println("Result of 5-- = " + firstValue4);
        System.out.println();
        // memberikan nilai kebalikan yang diberikan oleh sebuah boolean
        System.out.println("Logical Complement Operator");
        boolean success = false;
        System.out.println("Result of !false =" + !success);
        System.out.println();
    }
}
