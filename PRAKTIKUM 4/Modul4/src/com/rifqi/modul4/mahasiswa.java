package com.rifqi.modul4;

public class mahasiswa extends Person{
    /*
    mendeklarasikan variabel
     */
    private String nim;
    /*
    membuat akses modifier dengan parameternya
     */
    public mahasiswa(String name, String alamat) {
        super(name, alamat);
    }
/*
membuat akses modifier untuk mengakses nim
 */
    public void setNim(String nim) {
        this.nim = nim;
    }
/*
membuat method untuk dapat menampilkan nama, alamat
dan nim
 */
    public void display()
    {
        System.out.println("Nama    : "+name);
        System.out.println("Alamat  : "+alamat);
        System.out.println("NIM     : "+nim);
    }
}
