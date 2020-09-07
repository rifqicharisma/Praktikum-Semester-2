package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your grade (A-D) : ");
        char grade = scanner.next().charAt(0);
        if (grade == 'A') {
            System.out.println("You're Excellent");
        } else if (grade == 'B') {
            System.out.println("You're Good");
        } else if (grade == 'C') {
            System.out.println("You're Good Enough");
        } else if (grade == 'D') {
            System.out.println("You're Not Good Enough");
        } else {
            System.out.println("Input not Valid");
        }
    }
}
