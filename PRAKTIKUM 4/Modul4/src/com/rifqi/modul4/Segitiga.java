package com.rifqi.modul4;

public class Segitiga extends Bentuk
{
    double sisi;
/*
membuat method segitiga
 */
    public Segitiga() {
        super();
    }
/*
subclass dari segitiga
yang berisi hitungan luas segitiga
 */
    @Override
    protected void hitungLuas() {
        super.hitungLuas();
        super.luas = sisi*sisi/2;
        System.out.println("Luas segitiga "+super.luas);
    }
/*
dapat membuat 2 method dengan parameter sama tetapi tipe data harus berbeda
 */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
