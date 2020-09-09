package Soal1;

public class Stack {
    static String[] Stack;
    static int ukuran;
    static int top;

    public Stack(int ukuran) {
        top = 0;
        this.ukuran = ukuran;
        Stack = new String[ukuran];
    }

    static boolean isEmpty() {
        return top <= 0;
    }

    static boolean isFully() {
        return top >= ukuran;
    }

    static void insert(String data) {
        if (isFully()) {
            System.out.println("Maaf data penuh");
        } else {
            //System.out.println("Nilai " + data + " masuk ke antrean");
            Stack[top++] = data;
        }
    }

    static void pick() {
        if (isEmpty()) {
            System.out.println("Maaf data kosong");
        } else {
            top--;
            System.out.println("Huruf " + Stack[top] + " keluar dari tumpukan");
        }
    }

    static void display() {
        int data = top - 1;
        while (data >= 0) {
            System.out.print(Stack[data]);
            data--;
        }
    }

    static void tampilan() {
        int data = 0;
        while (data < top) {
            System.out.print(Stack[data]);
            data++;
        }
    }
}
