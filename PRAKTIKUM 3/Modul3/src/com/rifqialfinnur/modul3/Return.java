package com.rifqialfinnur.modul3;

public class Return {
    public static int multiplication(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        int varA = 27, varB = 17;
        System.out.println(varA + " x "+ varB+ " = "+multiplication(varA,varB));
    }
}