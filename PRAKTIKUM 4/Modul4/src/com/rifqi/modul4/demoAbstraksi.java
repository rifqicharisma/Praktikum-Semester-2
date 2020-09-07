package com.rifqi.modul4;

public class demoAbstraksi {
    public static void main(String[] args) {
        /*
        membuat objek baru
         */
        Ceplok ceplok = new Ceplok();
        Dadar dadar = new Dadar();
        /*
        memanggil class ceplok
         */
        ceplok.masakMakanan();
        ceplok.ready();
        /*
        memanggil class dadar
         */
        dadar.masakMakanan();
        dadar.ready();
    }

}
