package com.rifqi.latihanModul3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(i<7) {
            i++;
            System.out.print("Masukkan urutan hari dalam bahasa jawa kawi (1-7) : ");
            int hari = scanner.nextInt();
            switch (hari) {
                case 1:
                    System.out.println("Soma (senin)");
                    break;
                case 2:
                    System.out.println("Hanggara (selasa)");
                    break;
                case 3:
                    System.out.println("Budha (Rabu)");
                    break;
                case 4:
                    System.out.println("Respati (Kamis)");
                    break;
                case 5:
                    System.out.println("Sukra (Jumat)");
                    break;
                case 6:
                    System.out.println("Tumpak (Sabtu)");
                    break;
                case 7:
                    System.out.println("Radite (Minggu)");
                    break;
                default:
            }
            if (hari==0){
                System.out.println("Sampai Jumpa");
                break;
            }else if(hari<1||hari>7){
                System.out.println("Inputan anda salah");
                break;
            }
        }

    }
}
