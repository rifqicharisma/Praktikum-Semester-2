package com.rifqi.modul2;

public class OperatorConditional {
    public static void main(String[] args) {
        int value1 = 4;
        int value2 = 5;
        /*
        bila salah satu statement false maka hasilnya akan false
         */
        System.out.println("Conditional AND");
        boolean result = value1 == 3 && value2 == 5;
        boolean result2 = value1 != 3 && value2 == 5;
        System.out.println("The AND operator results on the conditions value1 == 3 and value2 == 5 is " + result);
        System.out.println("The AND operator results on the conditions value1 != 3 and value2 == 5 is " + result2);
        System.out.println();
        /*
        bila salah satu statement bernilai false maka hasilnya akan true
         */
        System.out.println("Conditional OR");
        result = value1 == 3 || value2 == 5;
        result2 = value1 != 3 || value2 == 5;
        System.out.println("The AND operator results on the conditions value1 == 3 and value2 == 5 is " + result);
        System.out.println("The AND operator results on the conditions != 3 and value2 == 5 is " + result2);
        System.out.println();
    }
}
