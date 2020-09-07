package com.rifqialfinnur.modul3;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i==3){
                System.out.println("Looping was continued");
                continue;
            }
            System.out.println("Looping - "+i);
        }
    }
}
