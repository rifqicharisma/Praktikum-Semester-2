package com.Rifqi.Latihan5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0, hasil;
        System.out.print("Masukkan jumlah data : ");
        int panjang = scanner.nextInt();
        int[] nilai = new int[panjang];
        for (int i = 0; i < panjang; i++) {
            System.out.print("Inputkan data ke-"+(i+1)+" : ");
            nilai[i] = scanner.nextInt();
        }

        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
        }
        hasil = sum/panjang;
        System.out.println("Nilai rata-ratanya : "+hasil);

        int maksimum = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > maksimum){
                maksimum = nilai[i];
            }
        }
        System.out.println("Nilai maksimumnya adalah : "+maksimum);
        int minimun = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < minimun){
                minimun = nilai[i];
            }
        }
        System.out.println("Nilai minimumnya adalah : "+minimun);

    }
}
