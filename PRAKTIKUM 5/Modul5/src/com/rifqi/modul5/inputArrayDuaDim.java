package com.rifqi.modul5;

import java.util.Scanner;

public class inputArrayDuaDim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // memasukkan jumlah baris
        System.out.print("Masukkan jumlah baris : ");
        int baris = scanner.nextInt();
        // memasukkan jumlah kolom
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = scanner.nextInt();
        // inisiasi array dengan baris dan kolom
        int[][] matriks = new int[baris][kolom];
        System.out.println("Inputkan data : ");
        // menginputkan baris dan kolom menggunakan nested looping
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Data Array ke[" + i + "][" + j + "] : ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n Data Array 2 Dimensi : ");
        // mencetak matriks dengan nested looping
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Data Array ke[" + i + "][" + j + "] : " + matriks[i][j]);
            }
        }
    }
}
