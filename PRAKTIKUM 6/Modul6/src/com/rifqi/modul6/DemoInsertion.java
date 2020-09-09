package com.rifqi.modul6;

public class DemoInsertion {
    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        int[] data = {123,12,1,65,78,3,17,7};
        System.out.println("Data sebelum diurutkan : ");
        // memanggil method mencetak data
        insertion.printData(data);
        // proses pengurutan data
        insertion.sort(data);
        // proses pencetakan data
        System.out.println("Data setelah diurutkan : ");
        insertion.printData(data);
    }
}
