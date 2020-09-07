package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;
        do{
            System.out.println("100 x 100 = ");
            var = scanner.nextInt();
        }while (var != 10000);
        System.out.println("Yeeeee Berhasil...");
    }
}