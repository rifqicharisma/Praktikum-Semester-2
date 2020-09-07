package com.rifqi.modul4;

public class lingkaran {
    // mendeklarasikan variabel
    private int r;
// membuat method lingkaran
    public lingkaran() {
    }
/*
membuat settr dilengkapi dengan parameternya
 */
    public void setR(int r) {
        this.r = r;
    }
/*
membuat settr lingkaran dengan parameternya
 */
    public lingkaran(int r) {
        this.r = r;
    }

/*
membuat method dengan parameternya
dan dimasukkan rumus luas lingkaran
 */
    private double getLuas() {
        return 3.14 * r * r;
    }
/*
membuat method yang akan menampilkan hasil dari rumus tersebut
 */
    public void display() {
        System.out.println("Luas lingkaran dengan r = " + r + " adalah: " + getLuas());
    }
}
