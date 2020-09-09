package com.ProgramB;

import java.util.Random;
import java.util.Scanner;

public class ProgramUTS {
    void sort(int[] X) {
        for (int i = 1; i < X.length; i++) {
            int z = X[i];
            int j = i - 1;
            while (j >= 0 && X[j] > z) {
                X[j + 1] = X[j];
                j = j - 1;
            }
            X[j + 1] = z;
        }
    }

    static public void Random(int [] X,int n){
        Random rand = new Random();

        int panjang = n;

        System.out.println("Array Acak\t:");
        for (int i = 0; i < panjang; i++) {
            int arayAcak = rand.nextInt(n);
            X[i] = arayAcak;
            System.out.print(" "+X[i] +" ");
        }
        System.out.println();
    }
    //--------
    public static void cetakArray(int[] X, int n){
        Random rand = new Random();

        int nilai = n;
        System.out.println("Array Sorting\t:");
        for (int i = 0; i < nilai; i++) {
            System.out.print(" " + X[i] + " ");
        }
    }

    public static void main(String[] args) {
        //input array
        Scanner scan = new Scanner(System.in);
        System.out.print("Ukuran Input Array :");
        int input = scan.nextInt();

        //atribut array
        int[] X = new int[input];

        ProgramUTS program = new ProgramUTS();
        program.Random(X, input);
        program.sort(X);
        program.cetakArray(X, input);
        System.out.println();
        final long startTime = System.currentTimeMillis();
        int l = 0;
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                for(int k=0; k<1000; k++){
                    l++;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("waktu eksekusi program: "+(endTime - startTime) + " ms");
    }
}
