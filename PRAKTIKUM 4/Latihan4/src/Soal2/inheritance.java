package Soal2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ketua : ");
        System.out.print("Nama : ");
        String nama = scanner.next();
        System.out.print("ID : ");
        int id = scanner.nextInt();

        System.out.println("Wakil : ");
        System.out.print("Nama : ");
        String nama1 = scanner.next();
        System.out.print("ID : ");
        int id1 = scanner.nextInt();

        System.out.println("Sekretaris : ");
        System.out.print("Nama : ");
        String nama2 = scanner.next();
        System.out.print("ID : ");
        int id2 = scanner.nextInt();

        System.out.println("Bendahara : ");
        System.out.print("Nama : ");
        String nama3 = scanner.next();
        System.out.print("ID : ");
        int id3 = scanner.nextInt();
       mahasiswa mahasiswa = new mahasiswa(nama, id);
       mahasiswa.k();
       mahasiswa mahasiswa1 = new mahasiswa(nama1, id1);
       mahasiswa.w();
       mahasiswa mahasiswa2 = new mahasiswa(nama2,id2);
       mahasiswa.s();
       mahasiswa mahasiswa3 = new mahasiswa(nama3,id3);
       mahasiswa.b();



    }


}
