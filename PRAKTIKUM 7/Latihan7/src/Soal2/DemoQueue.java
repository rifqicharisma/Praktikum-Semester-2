package Soal2;

import java.util.*;

public class DemoQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue data = new Queue(10);

        String pasien;
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.println("Pendaftaran berobat Rumah Sakit Cinta : ");
            System.out.println("--- Pendaftaran hanya dapat diulangi 10 kali ---");
            System.out.println("1. Daftar Pasien");
            System.out.println("2. Perbaharui Antrian");
            System.out.println("3. Cari Pasien Terdaftar");
            System.out.println("4. Lihat sisa slot pendaftaran");
            System.out.println("5. Lihat seluruh daftar antrian");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pil = scanner.nextInt();
            if (pil==1){
                System.out.print("Masukkan pasien : ");
                pasien = scanner.next();
                data.insert(pasien);
            } else if (pil==2){
                data.pop();
            } else if(pil==3){
                System.out.print("Masukkan data yang ingin dicari : ");
                String cari = scanner.next();
                data.find(cari);
            } else if(pil==4){
                data.sisa();
            } else if (pil==5){
                System.out.println();
                data.display();
            } else{
                System.exit(0);
            }
        }
    }
}
