package Soal2;

public class Queue {
    static String[] Queue;
    static int ukuran;
    static int top;

    public Queue(int ukuran) {
        top = 0;
        this.ukuran = ukuran;
        Queue = new String[ukuran];
    }

    static boolean isFully() {
        return top >= ukuran;
    }

    static boolean isEmpty() {
        return top <= 0;
    }


    static void insert(String data) {
        if (isFully()) {
            System.out.println("Maaf data penuh");
        } else {
            System.out.println(data + " masuk ke antrian");
            Queue[top++] = data;
        }
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("Maaf, antrean kosong");
        } else {
            String pop = Queue[0];
            int data = 1;
            System.out.println("Antrian ke-"+data + " keluar dari antrean");
            while (data < top) {
                Queue[data - 1] = Queue[data];
                data++;
            }
            top--;
        }
    }

    static void find(String data) {
        int temp = 0;
        boolean hasil = true;
        // proses pencarian data
        while (temp < top) {
            if (data == Queue[temp]) {
                hasil = true;
                break;
            }
            temp++;
        }
        if (hasil)
            System.out.println("Pasien " + data + " ditemukan di antrian "+ (temp));
        else
            System.out.println(data + " tidak ditemukan di dalam antrean");
    }

    static void display() {
        System.out.println("Isi antrean : ");
        int data = 0;
        while (data < top) {
            System.out.println("Antrean ke-" + (data + 1) + " : " + Queue[data]);
            data++;
        }
    }

    static void sisa(){
        System.out.println("Sisa slot pendaftaran : "+(ukuran-top));
    }
}
