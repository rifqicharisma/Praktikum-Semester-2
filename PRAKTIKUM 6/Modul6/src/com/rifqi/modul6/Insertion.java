package com.rifqi.modul6;

public class Insertion {
    public void sort(int[] data) {
        // membuat perulangan untuk penukaran data
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            // Proses pengecekan dan pertukaran
            while (j >= 0 && data[j] > key) {
                // pertukaran data
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = key;
            // proses cetak data
            System.out.println("Proses ke-"+i+" : ");
            printData(data);
        }
    }
    // method untuk mencetak data
    public void printData(int[] data) {
        for (int mData:data) {
            System.out.print(mData+ " ");
        }
        System.out.println();
    }

}
