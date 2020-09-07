package com.rifqi.modul4;

public class Person {
    // mendeklarasikan variabel dengan protected
    protected String name;
    protected String alamat;
// membuat modifier dengan parameternya
    public Person(String name, String alamat) {
        //super class
        super();
        this.name = name;
        this.alamat = alamat;
    }
/*
membuat method untuk menampilkan sebuah kalimat
 */
    protected void hello()
    {

        System.out.println("Saya adalah seorang mahasiswa");
    }
}
