package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is while looping, type Exit to close program");
        String text = scanner.nextLine();
        /*
        kode toUpperCase() berfungsi untuk inputan akan true entah
        kecil atau besar
         */
        while(!text.toUpperCase().equals("EXIT")){
            System.out.println("This is while looping, type EXIT to close program");
            text = scanner.nextLine();
        }

    }
}
