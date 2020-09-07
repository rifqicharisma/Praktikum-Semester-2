package Soal1;

import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======MENU KONVERSI SUHU======");
        System.out.println("Pilih suhu dari: ");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
        System.out.print("Masukkan pilihan: ");
        int pil = scanner.nextInt();
        System.out.print("Masukkan Suhu: ");
        double tmp = scanner.nextDouble();
        celcius celcius = new celcius();
        fahrenheit fahrenheit = new fahrenheit();
        kelvin kelvin = new kelvin();
        reamur reamur = new reamur();
        if (pil == 1) {
            System.out.println("Celcius : " + tmp);
            celcius.setTmp(tmp);
            celcius.display();
        } else if (pil == 2) {
            System.out.println("Fahrenheit : " + tmp);
            fahrenheit.setT(tmp);
            fahrenheit.d();
        } else if (pil == 3) {
            System.out.println("Kelvin : " + tmp);
            kelvin.setTmp(tmp);
            kelvin.display();
        } else if (pil == 4) {
            System.out.println("Reamur : " + tmp);
            reamur.setTmp(tmp);
            reamur.display();
        } else {
            System.out.println("Silahkan input dengan benar");
        }
    }
}
