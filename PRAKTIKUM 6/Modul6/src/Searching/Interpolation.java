package Searching;

public class Interpolation {
    // membuat method untuk algoritma interpolation
    private int interpolation(int[] data, int key) {
        // proses pembagian data
        int low = 0, high = (data.length - 1);
        while (low <= high && key >= data[low] && key <= data[high]) {
            if (low == high) {
                if (data[low] == key) return low;
                return -1;
            }
            // masukkan rumus interpolation
            int pos = low + (
                    ((high - low) / (data[high] - data[low])) * (key - data[low])
            );
            // proses pencocokan data
            if (data[pos] == key) return pos;
            if (data[pos] < key) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }
    // proses penemuan data
    public void search(int[] data, int key) {
        int result = interpolation(data, key);
        if (result != -1) {
            System.out.println("Data " + key + " ditemukan pada indeks ke " + result);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
