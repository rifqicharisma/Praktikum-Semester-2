package com.rifqi.modul7;

public class PriorityQueue {
    static int[] PriorityQueue;
    static int ukuran;
    static int top;

    // membuat method ukuran
    public PriorityQueue(int data) {
        ukuran = data;
        top = 0;
        PriorityQueue = new int[ukuran];
    }

    // membuat method jika data kosong
    static boolean isEmpty() {
        return top <= 0;
    }

    // method jika data penuh
    static boolean isFully() {
        return top >= ukuran;
    }

    // method untuk memasukkan data
    static void insert(int data) {
        // pengecekan apakah data kosong atau penuh
        if (isFully()) {
            System.out.println("Maaf data penuh");
        } else {
            // jiks data kosong, akan masuk ke prioritas
            if (isEmpty()) {
                PriorityQueue[top++] = data;
                System.out.println(data + " masuk ke Priority Queue");
            } else {
                // perulangan untuk memasukkan elemen ke prioritas
                int j;
                for (j = 0; j < top; j++) {
                    if (PriorityQueue[j] >= data) {
                        break;
                    }
                }

                for (int k = top; k > j; k--) {
                    PriorityQueue[k] = PriorityQueue[k - 1];
                }
                PriorityQueue[j] = data;
                System.out.println(data + " masuk ke Priority Queue");
                top++;
            }
        }
    }
    // method untuk mengeluarkan elemen dari antrian
    static void pop() {
        // dicek apakah data kosong atau tidak
        if (isEmpty()) {
            System.out.println("Maaf data kosong");
        } else {
            System.out.println(PriorityQueue[0] + " keluar dari antrean");
            for (int i = 1; i < top; i++) {
                PriorityQueue[i - 1] = PriorityQueue[i];
            }
            top--;
        }
    }
// menampilkan ukuran dari elemen
    static void size() {
        System.out.println("Jumlah antrean dalam Priority Queue" + top);
    }
// menampilkan elemen
    static void display() {
        for (int i = 0; i < top; i++) {
            System.out.println("Antrean ke-" + (i + 1) + " : " + PriorityQueue[i]);
        }
    }
}
