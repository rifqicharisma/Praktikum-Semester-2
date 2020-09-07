package Soal2;

public class mahasiswa extends person {
    public mahasiswa(String nama, int ID) {
        super(nama, ID);
    }

    void k(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Jabatan : Ketua");
    }

    void w(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Jabatan : Wakil");
    }

    void s(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Jabatan : Sekretaris");
    }

    void b(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Jabatan : Bendahara");
    }
}
