package com.rifqi.modul2;

public class stringg {
    public static void main(String[] args) {
        // cara mendeklarasikan string
        String hi = "Hello World";
        System.out.println(hi);

        System.out.println();
        /*
        mengetahui penjang dari string
         */
        String maName = "Harry Potter";
        int lenght = maName.length();
        System.out.println(maName + " leght is: " + lenght);

        System.out.println();
        /*
        mengambil karakter dari string
         */
        char result = maName.charAt(7);
        System.out.println("CharAt 7 of " + maName + " is: "+ result);

    }
}
