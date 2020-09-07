package Array;

public class IndexOutOfBounds {
    /*
    program eror yang disebabkan oleh percobaan
    saat  melakukan akses indeks yang tidak dimiliki oleh array.
     */
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        // Akses indeks ke 4
        System.out.println(arrA[4]);
    }
}
