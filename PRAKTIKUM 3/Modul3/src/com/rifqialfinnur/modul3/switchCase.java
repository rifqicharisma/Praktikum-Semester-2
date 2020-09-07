package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varA = 17, varB = 7;

        System.out.println("Choose the menu bellow: ");
        System.out.println("1. Multiplication");
        System.out.println("2. Divisison");
        System.out.println("3. Modulation");
        System.out.println("Your decision: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Multiply Result: " + (varA * varB));
                break;
            case 2:
                System.out.println("Div Result : " + (varA / varB));
                break;
            case 3:
                System.out.println("Mod Result : " + (varA % varB));
                break;
            default:
                System.out.println("Please Try Again....");
        }
    }
}
