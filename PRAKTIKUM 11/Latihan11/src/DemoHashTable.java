import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class DemoHashTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // membuat objek hashTabel dari Rak 1 dan Rak 2
        Hashtable<String, String> Rak1 = new Hashtable<>();
        Hashtable<String, String> Rak2 = new Hashtable<>();

        int rak = 0;
        String judul, letak;
        boolean menu = false;
        /* Menu daftar perpustakaan
        * Perulangan akan berjalan sampai user memilih menu exit/keluar*/
        do {
            System.out.println("\n<-------- Daftar Rak Perpustakaan -------->");
            System.out.println("1. Tambah Buku ke Rak");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Jumlah Buku");
            System.out.println("5. Tambah Buku ke Rak dari Rak yang Sudah Ada");
            System.out.println("6. Pindah Buku");
            System.out.println("7. Kosongkan Rak");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int input = scanner.nextInt();
            if (input==1){
                // memilih rak
                System.out.print("Pilih Rak [1/2] : ");
                rak = scanner.nextInt();
                // penambahan key dan value pada buku
                if (rak==1){
                    System.out.print("Masukkan Judul Buku : ");
                    scanner.nextLine();
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Letak Buku : ");
                    letak = scanner.next();
                    Rak1.put(judul, letak); // judul sebagai key dan letak sebagai value
                    System.out.println("Buku berhasil ditambahkan di Rak 1");
                }else if(rak==2){
                    System.out.print("Masukkan Judul Buku : ");
                    scanner.nextLine();
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Letak Buku : ");
                    letak = scanner.next();
                    Rak2.put(judul, letak);
                    System.out.println("Buku berhasil ditambahkan di Rak 2");
                }else {
                    System.out.println("Mohon Masukkan Rak 1/2 Saja....");
                }
            }else if(input==2){ // cetak data dari rak 1 atau rak 2
                System.out.print("Pilih Rak [1/2] : ");
                rak = scanner.nextInt();
                if (rak==1){
                    if(Rak1.isEmpty()){ // jika rak kosong
                        System.out.println("Mohon Maaf, Rak Kosong");
                    }else {
                        System.out.println("Data Buku Rak 1 : ");
                        printData(Rak1);
                    }
                }else if(rak==2){
                    if(Rak2.isEmpty()){ // jika rak kosong
                        System.out.println("Mohon Maaf, Rak Kosong");
                    }else {
                        System.out.println("Data Buku Rak 2 : ");
                        printData(Rak2);
                    }
                }else{
                    System.out.println("Mohon Masukkan Rak 1/2 Saja....");
                }
            }else if (input==3){ // pencarian buku berdasarkan judul/key
                System.out.print("Masukkan Judul Buku : ");
                scanner.nextLine();
                String key = scanner.nextLine();
                // pemeriksaan buku
                String ans = Rak1.containsKey(key)? "Yes":"No";
                String ans2 = Rak2.containsKey(key)? "Yes": "No";
                // hasil
                if(ans=="Yes"){
                    System.out.println("Buku '"+key+"' berada di nomor "+Rak1.get(key));
                }else if(ans2=="Yes"){
                    System.out.println("Buku '"+key+"' berada di nomor "+Rak2.get(key));
                }else{
                    System.out.println("Buku '"+key+"' tidak ditemukan");
                }
            }else if(input==4){
                // melihat jumlah buku di masing-masing rak
                System.out.println("Jumlah Buku di Rak 01 : "+Rak1.size());
                System.out.println("Jumlah Buku di Rak 02 : "+Rak2.size());
            }else if (input==5){
                System.out.print("Pilih Rak [1/2] : ");
                rak = scanner.nextInt();
                if (rak==1){
                    // data rak 1 disalin ke rak 2
                    Rak2.putAll(Rak1);
                    System.out.println("Rak 1 berhasil disalin ke Rak 2");
                }else if (rak==2){
                    // data rak 2 disalin ke rak 1
                    Rak1.putAll(Rak2);
                    System.out.println("Rak 2 berhasil disalin ke Rak 1");
                }else {
                    System.out.println("Masukkan Rak 1/2 Saja.........");
                }
            }else if(input==6){
                // pindah buku / replace value dari buku
                System.out.print("Pilih Rak [1/2] : ");
                rak = scanner.nextInt();
                if (rak==1){
                    System.out.print("Masukkan Judul Buku : ");
                    scanner.nextLine();
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Letak Buku yang Baru : ");
                    letak = scanner.next();
                    // proses replace value
                    Rak1.replace(judul, letak);
                    System.out.println("Buku Berhasil Dipindahkan");
                }else{
                    System.out.print("Masukkan Judul Buku : ");
                    scanner.nextLine();
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Letak Buku yang Baru : ");
                    letak = scanner.next();
                    // proses replace value
                    Rak2.replace(judul, letak);
                    System.out.println("Buku Berhasil Dipindahkan");
                }
            }else if (input==7){
                // hapus semua data di rak 1 atau 2
                System.out.print("Pilih Rak [1/2] : ");
                rak = scanner.nextInt();
                if (rak==1){
                    Rak1.clear();
                    System.out.println("Data Pada Rak 1 Telah Terhapus");
                }else{
                    Rak2.clear();
                    System.out.println("Data Pada Rak 2 Telah Terhapus");
                }
            }else if(input==8){
                System.out.println("Terimakasih Sudah Menggunakan Program Ini.... :)");
                System.exit(0);
            }else {
                System.out.println("Masukkan Pilihan yang Benar.......");
            }
        }while (!menu);
    }
    // method mencetak key dan value
    private static void printData(Map<String, String> map){
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Nomor : "+entry.getValue()+" Judul Buku : "+entry.getKey());
        }
    }

}
