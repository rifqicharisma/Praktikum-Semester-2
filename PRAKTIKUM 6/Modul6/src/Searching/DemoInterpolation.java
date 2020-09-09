package Searching;

import com.rifqi.modul6.Quick;

public class DemoInterpolation {
    public static void main(String[] args) {
        Quick quick = new Quick();
        Interpolation interpolation = new Interpolation();
        int[] data = {123, 324, 23, 4, 6, 7, 12, 17};
        // data harus diurutkan terlebih dahulu
        quick.sort(data, 0, (data.length - 1));
        // baru memanggil algortima pencarian
        interpolation.search(data, 17);
    }
}