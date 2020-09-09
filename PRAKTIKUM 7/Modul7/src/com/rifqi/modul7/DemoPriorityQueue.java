package com.rifqi.modul7;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue data = new PriorityQueue(4); // membuat objek
        // memasukkan data
        data.insert(9);
        data.insert(2);
        data.insert(17);
        data.insert(6);
        // menampilkan data
        data.display();
        // mengeluarkan elemen dari antrian
        data.pop();
        // menampilkan data terbaru
        data.display();
    }
}
