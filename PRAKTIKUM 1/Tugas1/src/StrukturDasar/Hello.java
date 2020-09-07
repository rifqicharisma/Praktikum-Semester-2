package StrukturDasar;

import StrukturDasar.Kendaraan.*;
import StrukturDasar.Musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //mengimport kelas dari gitar
        Gitar.bunyi();

        //memanggil kelas mobil, motor dan kereta
        Mobil.jumlahBan();
        Kereta.jumlahBan();

        //menambahkan tanggal
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
