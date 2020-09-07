package com.rifqi.latihanModul3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        float rata = 0, jumlah = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        String name = scanner.nextLine();
        System.out.print("Berapa Mata Kuliah : ");
        int matkul = scanner.nextInt();

        while (i < matkul)
        {
            i++;
            System.out.print("Nilai Mata Kuliah ke-"+(i)+ " : ");
            int nilai =  scanner.nextInt();
            jumlah += nilai;
            rata = jumlah/matkul;
        }
        System.out.print("Maka Rata-ratanya adalah : "+rata);
        System.out.println();
        if (rata>=80){
            System.out.println("Predikatnya A");
        }else if (rata>=50){
            System.out.println("Predikatnya B");
        }else if (rata>=30){
            System.out.println("Predikatnya C");
        }else{
            System.out.println("Predikatnya D");
        }
    }
}