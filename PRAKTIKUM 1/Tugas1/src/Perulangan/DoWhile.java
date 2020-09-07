package Perulangan;

public class DoWhile {
    /*
    program yang digunakan untuk memahami perulangan di while
    dimana statement akan dijalankan sebanyak satu kali terlebih dahulu
    jika bernilai true maka perulangan akan terus berlanjut
     */
    public static void main(String[] args) {
        int nilai = 1;
        do {
            System.out.println("Angka : " + nilai);
            nilai++;
        } while (nilai <= 10);
    }
}
