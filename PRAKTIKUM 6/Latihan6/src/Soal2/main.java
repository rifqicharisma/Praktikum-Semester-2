package Soal2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class main {
    void sort(int[] X) {
        for (int i = 1; i < X.length; i++) {
            int z = X[i];
            int j = i - 1;
            while (j >= 0 && X[j] < z) {
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
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Searching searching = new Searching();

        System.out.print("Ukuran Input Array :");
        int input = scan.nextInt();

        //atribut array
        int[] X = new int[input];

        main main = new main();
        main.Random(X, input);
        main.sort(X);
        main.cetakArray(X, input);
        System.out.println();
        int acak = random.nextInt(10);
        System.out.print("Masukkan data : "+acak);
        System.out.println();
        searching.search(X, acak);
    }
}
