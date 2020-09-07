package com.rifqi.modul2;
/*
inisialisasi awal ketika akan menggunakan Scanner
 */
import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple additions program");

        System.out.print("Input First value : ");
         /*
        Dengan memanggil Scanner.nextInt() setiap Input dari keyboard akan diberikan ke value1
         */
        int firstvalue = scanner.nextInt();
        System.out.print("Input second value : ");
        int secondvalue = scanner.nextInt();
        //melakukan penjumlahan value 1 dan 2
        int sum = firstvalue + secondvalue;
        System.out.println("Result is : " +sum);
    }
}
