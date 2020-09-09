// contoh input array satu dimensi
package com.rifqi.modul5;

import java.util.Scanner;

public class arraySatuDimensiInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tentukam panjang array : ");
        int panjang = scanner.nextInt();
        // menentukan panjang sebuah array
        int[] nilai = new int[panjang];
        System.out.println("Inputkan data : ");
        // menginputkan array dengan looping
        for (int i = 0; i < panjang; i++) {
            System.out.print("Inputkan array ke-"+i+" : ");
            nilai[i] = scanner.nextInt();
        }
        System.out.println("Data array yang telah diurutkan : ");
        int sum = 0;
        // menjumlahkan array dengan perulangan
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Array ke-"+i+ " : "+nilai[i]);
            sum += nilai[i];
        }
        float rata = sum/nilai.length;
        // mencari rata-rata array
        System.out.println("Nilai rata-rata : "+rata);
    }
}
