package com.rifqi.modul5;

public class demoArrayDuaDim {
    public static void main(String[] args) {
        int[][] matriks = { //deklarasi dan inisiasi array
                {3,5,9},
                {12,7,4}
        };
        // cetak array matriks
        System.out.println("Data Array ke[" + 0 + "][" + 0 + "] : "+matriks[0][0]);
        System.out.println("Data Array ke[" + 0 + "][" + 1 + "] : "+matriks[0][1]);
        System.out.println("Data Array ke[" + 0 + "][" + 2 + "] : "+matriks[0][2]);
        System.out.println("Data Array ke[" + 1 + "][" + 0 + "] : "+matriks[1][0]);
        System.out.println("Data Array ke[" + 1 + "][" + 1 + "] : "+matriks[1][1]);
        System.out.println("Data Array ke[" + 1 + "][" + 2 + "] : "+matriks[1][2]);
        // cetak array dengan perulangan
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Data Array ke[" + i + "][" + j + "] : "+matriks[i][j]);
            }
        }
    }
}