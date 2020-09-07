package com.rifqi.modul4;

public class demoInheritance {
    public static void main(String[] args) {
        // membuat objek mahasiswa diisi dengan paramternya
        mahasiswa mahasiswa = new mahasiswa(
                "Suroso",
                "Purwokerto"
        );
        // memanggil class mahasiswa dan method NIM
        mahasiswa.setNim("19786532");
        // memanggil class mahasiswa dan menthod hello
        mahasiswa.hello();
        // memanggil class mahasiswa dan method display
        mahasiswa.display();
    }
}
