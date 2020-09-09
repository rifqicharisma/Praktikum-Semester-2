package com.rifqi.modul6;

public class DemoQuick {
    public static void main(String[] args) {
        Quick quick = new Quick();
        int[] data = {123, 12, 1, 65, 78, 3, 17, 7};
        System.out.println("Data sebelum diurutkan : ");
        // mencetak data sebelum diurutkan
        quick.printData(data);
        // proses pengurutan data
        quick.sort(data, 0, (data.length - 1));

        System.out.println("Data setelah diurutkan : ");
        // proses pencetakan data yang sudah terurut
        quick.printData(data);
    }
}