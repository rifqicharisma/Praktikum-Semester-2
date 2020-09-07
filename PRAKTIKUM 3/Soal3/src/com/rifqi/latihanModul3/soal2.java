package com.rifqi.latihanModul3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int j = 1;
        Scanner scanner =  new Scanner(System.in);
        int x, y, pangkat = 1;
        System.out.print("Masukkan nilai : ");
        x = scanner.nextInt();
        System.out.print("Masukkan pangkat : ");
        y = scanner.nextInt();
        while (y==0){
            System.out.println("Tidak terdefinisi");
            break;
        }
        for (int i = 1; !(i>y); i=i+1) {
            pangkat = pangkat*x;
        }
        if (y!=0){
            System.out.print("Hasil pangkatnya adalah : "+pangkat);
        }
    }
}
