import java.io.*;
public class Soal1 {
    public static void main(String[] args) {
        System.out.println("==========PENDAFTARAN MAHASISWA BARU==========");
        System.out.println();
        System.out.println("Selamat Datang di IT Telkom Purwokerto,");
        System.out.println("Silahkan isi form di bawah untuk mendaftar.");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String name, school, study;
        int nilai;
        try {
            System.out.print("Nama\t\t\t\t\t: ");
            name = bufferedReader.readLine();
            System.out.print("Asal Sekolah\t\t\t: ");
            school = bufferedReader.readLine();
            System.out.print("Rata-rata nilai smt 1-5 : ");
            nilai = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan Program Studi  : ");
            study = bufferedReader.readLine();
            System.out.println();
            System.out.println("==========KONFIRMASI REGISTRASI==========");
            System.out.println("Nama\t\t\t: " + name);
            System.out.println("Asal Sekolah\t: " + school);
            System.out.println("Rata-rata Nilai\t: " + nilai);
            System.out.println("Pilihan Prodi\t: " + study);

        }catch (IOException e){
            System.out.println("Error !");
        }


    }
}
