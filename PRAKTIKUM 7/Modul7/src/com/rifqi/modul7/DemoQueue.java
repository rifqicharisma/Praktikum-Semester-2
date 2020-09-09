package com.rifqi.modul7;

import java.util.Scanner;

public class DemoQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue data = new Queue(5); // membuat objek
        // memasukkan data
        data.insert(78);
        data.insert(26);
        data.insert(5);
        data.insert(9);
        data.insert(2);
        // menampilkan data
        data.display();
        // mengeluarkan elemen
        data.pop();
        // menampiljan data terbaru
        data.display();
        System.out.print("Cari data : ");
        int cari = scanner.nextInt();
        data.find(cari);
    }
}
