package com.ProgramA;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
public class ProgramUTS {
    void sort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
