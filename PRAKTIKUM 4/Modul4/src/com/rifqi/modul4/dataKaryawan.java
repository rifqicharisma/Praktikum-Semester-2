package com.rifqi.modul4;
// membuat kelas data karyawan
public class dataKaryawan {
    /*
    mendeklarasikan variabel dengan private
     */
    private String nama = "Bambank Soenarjoe";
    private String jabatan = "Raja Bajak Laut";
    private int umur = 100;

    /*
    membuat method display
     */
    public void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Umur : " + umur + " tahun");
    }
}
