package com.rifqi.modul6;

public class Selection {
    public void sort(int[] data){
        for (int i = 0; i < (data.length-1); i++) {
            // proses mencari indeks minimum
            int min = i;
            for (int j = (i+1); j < data.length; j++) {
                if (data[j] < data[min]) min = j;
            }
            // proses penukaran data
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
            // menceetak proses pengurutan data
            System.out.println("Proses ke-"+i+" : ");
            printData(data);
        }
    }
    // mencetak data yang sudah diurutkan
    public void printData(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
