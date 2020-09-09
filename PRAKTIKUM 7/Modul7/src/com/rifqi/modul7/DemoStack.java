package com.rifqi.modul7;

public class DemoStack {
    public static void main(String[] args) {
        Stack data = new Stack(4); // membuat objek stack
        // memasukkan data
        data.insert(9);
        data.insert(12);
        data.insert(8);
        data.insert(94);
        // menampilkan antrian
        data.display();
        // mengeluarkan elemen
        data.pick();
        // menampilkan antrian terbaru
        data.display();
        // menemukan data
        data.find(8);
    }
}
