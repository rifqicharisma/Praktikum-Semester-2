package com.rifqi.modul6;

public class DemoSelection {
    public static void main(String[] args) {
        Selection selection = new Selection();
        // membuat data aray
        int[] data = {123,12,1,65,78,3,17,7};
        System.out.println("Data sebelum diurutkan : ");
        // memanggil method cetak data
        selection.printData(data);
        // memanggil method pengurutan
        selection.sort(data);
        // menampilkan data yang telah diurutkan
        System.out.println("Data setelah diurutkan : ");
        selection.printData(data);
    }
}
