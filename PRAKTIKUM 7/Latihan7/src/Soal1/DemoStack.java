package Soal1;

import java.util.Scanner;

public class DemoStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String karakter;
        System.out.print("Masukkan panjang karakter : ");
        int panjang = scanner.nextInt();
        Stack data = new Stack(panjang);
        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan karakter : ");
            karakter = scanner.next();
            data.insert(karakter);
        }
        System.out.println();
        System.out.print("Nama anda : ");
        data.tampilan();
        System.out.println();
        System.out.print("Setelah dibalik namanya : ");
        data.display();
        System.out.println();
        data.pick();
        System.out.print("Sisa stack : ");
        data.display();
    }
}
