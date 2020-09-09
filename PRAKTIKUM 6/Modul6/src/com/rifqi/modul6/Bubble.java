package com.rifqi.modul6;

public class Bubble {
    public void sort(int[] data) {
        // perulangan untuk menukar dan mengecek data
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                // proses pengecekan data
                if (data[j] > data[j + 1]) {
                    // proses penukaran data
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
            // cetak data
            System.out.println("Proses ke-" + i + " : ");
            printData(data);
        }
    }
    // proses pencetakan data
    public void printData(int[] data) {
        for (int mData : data) {
            System.out.print(mData + " ");
        }
        System.out.println();
    }
}
