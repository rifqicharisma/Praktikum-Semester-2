package Array;

public class InisiasiArray {
    /*
    program yang digunakan untuk menginisiasi array.
    Array adalah obyek yang bisa digunakan untuk menyimpan
    kumpulan data lebih dari satu dengan tipe  sama.
     */
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        System.out.println();

        // cara sederhananya dengan membuang new + tipe data
        int[] arrInte = {1, 2, 3, 4, 5, 6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
    }
}
