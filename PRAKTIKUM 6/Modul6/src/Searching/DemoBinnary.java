package Searching;

import com.rifqi.modul6.Quick;

public class DemoBinnary {
    public static void main(String[] args) {
        Quick quick = new Quick();
        Binnary binnary = new Binnary();
        int[] data = {123, 324, 23, 4, 6, 7, 12, 17};
        // data harus diurutkan terlebih dahulu
        quick.sort(data, 0, (data.length - 1));
        // pemanggilan algoritma searching
        binnary.search(data,17);
    }
}