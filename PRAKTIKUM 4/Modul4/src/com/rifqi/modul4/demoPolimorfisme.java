package com.rifqi.modul4;

public class demoPolimorfisme {
    public static void main(String[] args) {
        // membuat objek baru
        Segitiga segitiga = new Segitiga();
        // memanggil class segitiga dan method sisi
        segitiga.setSisi(7);
        // memanggil class segitiga dan method hitung luas
        segitiga.hitungLuas();
    }
}
