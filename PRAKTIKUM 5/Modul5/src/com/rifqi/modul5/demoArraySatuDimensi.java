// demo array satu dimensi
package com.rifqi.modul5;

public class demoArraySatuDimensi {
    public static void main(String[] args) {
        // mendeklarasikan array
        int[] nilai = {1,2,3,4,5,6};
        // mencetak array
        System.out.println("array ke-" + 0 + " : "+nilai[0]);
        System.out.println("array ke-" + 1 + " : "+nilai[1]);
        System.out.println("array ke-" + 2 + " : "+nilai[2]);
        System.out.println("array ke-" + 3 + " : "+nilai[3]);
        System.out.println("array ke-" + 4 + " : "+nilai[4]);
        System.out.println("array ke-" + 5 + " : "+nilai[5]);
        // cara menjumlahkan array dengan cara manual
        int sum = nilai[1] + nilai[2] + nilai[3] + nilai[4] + nilai[5] + nilai[0];
        // mencari rata- rata array
        System.out.println("Nilai rata-rata : "+(sum/6));
        // menjumlahkan array dengan cara looping
        for (int i = 0; i <6 ; i++) {
            System.out.println("array ke-"+i+" : "+nilai[i]);
            sum += nilai[i];
        }
        System.out.println("Nilai rata-rata : "+sum);
    }
}
