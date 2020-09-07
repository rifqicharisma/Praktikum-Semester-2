package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class Recursive {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Value : ");
        int val = scanner.nextInt();
        System.out.println("The Factorial value from "+ val + " is "+ factorial(val));
    }
}
