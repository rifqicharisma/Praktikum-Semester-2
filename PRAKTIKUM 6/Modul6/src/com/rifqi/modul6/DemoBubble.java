package com.rifqi.modul6;

public class DemoBubble {
    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int[] data = {123, 12, 1, 65, 78, 3, 17, 7};
        System.out.println("Data sebelum diurutkan : ");
        // mencetak data sebelum diurutkan
        bubble.printData(data);
        // proses pengurutan data
        bubble.sort(data);

        System.out.println("Data setelah diurutkan : ");
        // proses pencetakan data yang sudah diurutkan
        bubble.printData(data);
    }
}
