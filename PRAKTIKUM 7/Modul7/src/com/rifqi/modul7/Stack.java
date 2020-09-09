package com.rifqi.modul7;

public class Stack {
    static int[] Stack;
    static int ukuran;
    static int top;

    // membuat method ukuran
    public Stack(int ukuran) {
        top = 0;
        this.ukuran = ukuran;
        Stack = new int[ukuran];
    }

    // membuat method jika data kosong
    static boolean isEmpty() {
        return top <= 0;
    }

    // membuat method jika data penuh
    static boolean isFully() {
        return top >= ukuran;
    }

    // membuat method memasukkan data
    static void insert(int data) {
        // kondisi data penuh atau tidak
        if (isFully()) {
            System.out.println("Maaf data penuh");
        } else {
            System.out.println("Nilai " + data + " masuk ke antrean");
            Stack[top++] = data;
        }
    }

    // membuat method pengeluaran data
    static void pick() {
        // pengecekan antrian kosong atau tidak
        if (isEmpty()) {
            System.out.println("Maaf data kosong");
        } else {
            top--;
            System.out.println("Antrean ke-" + Stack[top] + " keluar dari tumpukan");
        }
    }

    // method untuk mencari data
    static void find(int data) {
        boolean hasil = false;
        int temp = 0;
        // proses pencarian data
        while (temp < top) {
            if (data == Stack[temp]) {
                hasil = true;
                break;
            }
            temp++;
        }

        // hasil dari pencarian data
        if (hasil)
            System.out.println(data + " ditemukan di tumpukan ke-" + temp);
        else
            System.out.println(data + " tidak ditemukan");
    }

    // method untuk menampilkan data
    static void display() {
        int data = top - 1;
        while (data >= 0) {
            System.out.println("Nilai tumpukan ke-" + (data + 1) + " : " + Stack[data]);
            data--;
        }
    }
}
