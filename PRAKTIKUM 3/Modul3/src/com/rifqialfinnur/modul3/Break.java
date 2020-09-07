package com.rifqialfinnur.modul3;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5){
                System.out.println("Looping was stopped!");
                break;
            }
            System.out.println("Looping - "+i);
        }
    }
}