package com.rifqi.modul2;
/*
inisialisasi awal ketika akan menggunakan Buffered reader
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userBufferedReader {
    public static void main(String[] args) {
        /*
        menginisialisasi BufferedReader yang dibantu oleh reader
        agar dapat membaca Input dari Keyboard.
         */
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Simple additions program");
        int firstvalue = 0;
        int secondvalue = 0;
        try {
            System.out.print("input first value : ");
            /*
            bila ingin menngunakan integer maka harus dikonversi dulu menggunakan
            Integer.parseInt(bufferedReader.readLine())
             */
            firstvalue = Integer.parseInt(bufferedReader.readLine());
            System.out.print("input second value : ");
            secondvalue = Integer.parseInt(bufferedReader.readLine());
            /*
            penanganan eror pada buffered reader
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = firstvalue + secondvalue;
        System.out.println("Hasilnya adalah : " + sum);
    }
}
