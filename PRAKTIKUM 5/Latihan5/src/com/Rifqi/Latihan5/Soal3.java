package com.Rifqi.Latihan5;

import java.util.Random;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = scanner.nextInt();
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        int[][] kali = new int[baris][kolom];
        Random random = new Random();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks1[i][j] = random.nextInt(10);
                matriks2[i][j] = random.nextInt(10);
            }
        }
        System.out.println("MATRIKS A :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MATRIKS B : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Penjumlahan : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Perkalian : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < 2; k++) {
                    kali[i][j] += matriks1[i][k] * matriks2[k][j];
                }

            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(kali[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
