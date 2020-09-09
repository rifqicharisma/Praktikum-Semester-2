package Soal1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorting sorting = new Sorting();
        String mahasiswa, NIM, faculty;
        System.out.print("Berapa input : ");
        int input = scanner.nextInt();
        String[] nim = new String[input];
        String[] nama = new String[input], fakul = new String[input];
        for (int i = 0; i < input; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" : ");
            System.out.print("Masukkan NIM : ");
            nim[i] = scanner.next();
            System.out.print("Masukkan Nama : ");
            nama[i] = scanner.next();
            System.out.print("Masukkan Fakultas : ");
            fakul[i] = scanner.next();
        }

        for ( int d = 0; d < input; d++){
            for( int b = 1; b < input; b++){
                if ( nim [b-1].compareTo(nim[b]) > 0){
                    mahasiswa = nama[b-1];
                    NIM = nim[b-1];
                    faculty= fakul[b-1];
                    nama [b-1]= nama [b];
                    nim [b-1]= nim [b];
                    fakul[b-1] = fakul[b];
                    nama[b] = mahasiswa;
                    nim[b] = NIM;
                    fakul[b] = faculty;
                }
            }
        }
        System.out.println();
        System.out.println("<------- Setelah diurutkan -------->");
        System.out.println();
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan NIM : "+nim[i]);
            System.out.println("Masukkan Nama : "+nama[i]);
            System.out.println("Masukkan Fakultas : "+fakul[i]);
        }
    }
}
