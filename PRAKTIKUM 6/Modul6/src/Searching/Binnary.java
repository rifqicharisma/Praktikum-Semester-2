package Searching;

public class Binnary {
    // mmebuat method untuk pencarian data
    private int binnary(int[] data, int key) {
        // mendeklarasikan variabel untuk membagi data
        int left = 0, right = (data.length - 1);
        // proses pembagian data dan pencarian data
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (data[mid] == key) return mid;
            if (data[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    // method untuk menemukan data
    public void search(int[] data, int key) {
        int result = binnary(data, key);
        // penemuan kata kunci
        if (result != -1) {
            System.out.println("Data " + key + " ditemukan pada indeks ke " + result);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
