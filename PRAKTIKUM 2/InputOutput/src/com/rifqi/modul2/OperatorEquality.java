package com.rifqi.modul2;

public class OperatorEquality {
    public static void main(String[] args) {
        /*
        operator akan menampilkan true atau false tergantung statement
        yang diberikan
         */
        int value1 = 5;
        int value2 = 4;
        boolean result;
        result = value1 == value2;
        System.out.println("Result 'value1 == value2' iis " + result);
        System.out.println();
        System.out.println("Not equal with..");
        result = value1 != value2;
        System.out.println("result 'value1 != value2' is " + result);
        System.out.println();
        System.out.println("Greater than..");
        result = value1 > value2;
        System.out.println("result 'value1 > value2' is " + result);
        System.out.println();
        System.out.println("Equal or Greater than..");
        result = value1 >= value2;
        System.out.println("result 'value1 >= value2' is " + result);
        System.out.println();
        System.out.println("Less than..");
        result = value1 < value2;
        System.out.println("result 'value1 < value2' is " + result);
        System.out.println();
        System.out.println("Equal or less than with..");
        result = value1 <= value2;
        System.out.println("result 'value1 <= value2' is " + result);
        System.out.println();
    }
}
