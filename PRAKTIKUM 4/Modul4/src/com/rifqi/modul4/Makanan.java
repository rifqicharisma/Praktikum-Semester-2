package com.rifqi.modul4;

public  abstract class Makanan {
    // membuat method abstraksi
    abstract void masakMakanan();
// membuat method apabila makanan sudah siap
    public void ready()
    {
        System.out.println("Makanan telah siap");
    }
}
