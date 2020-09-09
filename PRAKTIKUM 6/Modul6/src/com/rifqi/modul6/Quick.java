package com.rifqi.modul6;

public class Quick {
    // membuat method partisi data
    private int partition(int[] data, int low, int high) {
        // mendeklarasikan variable pivot
        int pivot = data[high];
        int i = low - 1;
        // perulangan untuk membagi data
        for (int j = low; j < high; j++) {
            // proses pengecekan data
            if (data[j] < pivot) {
                i++;
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        }

        // porses Pertukaran data
        int tmp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = tmp;
        // mencetak proses partisi data dan pengurutan
        System.out.println("Pivot : " + (i + 1));
        System.out.println("Partisi : ");
        printData(data);
        return i + 1;
    }
    // method untuk mencetak data
    public void printData(int[] data) {
        for (int mData : data) {
            System.out.print(mData + " ");
        }
        System.out.println();
    }
    // method untuk sorting data
    public void sort(int[] data, int low, int hight) {
        // proses penukaran data
        if (low < hight) {
            int pivot = partition(data, low, hight);
            sort(data, low, pivot - 1);
            sort(data, pivot + 1, hight);
        }
    }
}
