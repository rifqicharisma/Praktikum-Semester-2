package com.Rifqi.Latihan5;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.next();
        char[] kata1 = kalimat.toCharArray();
        char[] kata2 = kalimat.toCharArray();
        boolean ketemu = false;
        for (int a = kalimat.length() - 1; a >= 0; a--) {
            for (int b = 0; b < kalimat.length(); b++) {
                if (kata1[a] == kata2[b]) {
                    ketemu = true;
                } else {
                    ketemu = false;
                }
            }
        }
        if (ketemu == true) {
            System.out.println("Kalimat tersebut adalah Palindrom !");
        } else {
            System.out.println("Kalimat tersebut Bukan Palindrom !");
        }
    }
}

