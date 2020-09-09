package com.rifqi.modul7;

public class Queue {
    // mendeklarasikan variabel
    static int[] Queue;
    static int ukuran;
    static int top;

    // membuat method antrian dengan parameter ukuran
    public Queue(int ukuran) {
        top = 0;
        this.ukuran = ukuran;
        Queue = new int[ukuran];
    }

    // membuat method jika antrian sudah penuh
    static boolean isFully() {
        return top >= ukuran;
    }

    // membuat method jika antrian kosong
    static boolean isEmpty() {
        return top <= 0;
    }

    // membuar method untuk memasukkan data dalam antrian
    static void insert(int data) {
        if (isFully()) {
            System.out.println("Maaf data penuh");
        } else {
            System.out.println("Nilai " + data + " masuk ke antrean");
            Queue[top++] = data;
        }
    }

    static void pop() { // method ini berfungsi untuk mengeluarkan elemen antrean
        if (isEmpty()) { // dicek dulu apakah antrean kosong atau tidak
            System.out.println("Maaf, antrean kosong");
        } else {
            int pop = Queue[0];
            int data = 1;
            System.out.println("Nilai " + data + " keluar dari antrean");
            while (data < top) {
                Queue[data - 1] = Queue[data];
                data++;
            }
            top--;
        }
    }

    // membuat method untuk mencari data
    static void find(int data) {
        int temp = 0;
        boolean hasil = false;
        // proses pencarian data
        while (temp < top) {
            if (data == Queue[temp]) {
                hasil = true;
                break;
            }
            temp++;
        }
        // hasil dari pencarian data
        if (hasil)
            System.out.println("Nilai " + data + " ditemukan di tumpukan "+(temp+1));
        else
            System.out.println(data + "tidak ditemukan di dalam antrean");
    }

    // method untuk menampilkan data
    static void display() {
        System.out.println("Isi antrean : ");
        int data = 0;
        while (data < top) {
            System.out.println("Antrean ke-" + (data + 1) + " : " + Queue[data]);
            data++;
        }
    }

}
