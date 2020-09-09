package rifqi.modul8;

import java.util.LinkedList;

public class DemoLinkedList {
    // deklarasikan objek linked list dengan tipe data integer
    static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        DemoLinkedList demoLinkedList = new DemoLinkedList(); // membuat objek dari class demo linked list
        // memanggil method menambahkan data
        demoLinkedList.add(10);
        printData();
        // memanggil method menambahkan data dengan indeks
        demoLinkedList.add(1,6);
        printData();
        // menambahkan data di awal elemen
        demoLinkedList.addFirst(5);
        printData();
        // menambahkan data di akhir elemen
        demoLinkedList.addLast(6);
        printData();

        System.out.println("peek(): "+linkedList.peek());   // mengambil data pertama
        System.out.println("peekFirst(): "+linkedList.peekFirst());
        System.out.println("peekLast(): "+linkedList.peekLast()); // mengambil data terakhir

        demoLinkedList.add(34);
        printData();

        demoLinkedList.add(2,56);
        printData();

        demoLinkedList.addFirst(12);
        printData();

        demoLinkedList.addLast(24);
        printData();

        System.out.println("get(3): "+linkedList.get(3)); // mengambil data di indeks ke 3
        System.out.println("getFirst(): "+linkedList.getFirst()); // mengambil data pertama
        System.out.println("getLast(): "+linkedList.getLast()); // mengambil data terakhir

        System.out.println("size: "+linkedList.size()); // mengetahui ukuran data

        demoLinkedList.remove(); // menghapus data pertama
        printData();

        demoLinkedList.remove(3); // menghapus data indeks ke 3
        printData();

        demoLinkedList.removeFirst(); // menghapus data pertama
        printData();

        demoLinkedList.removeLast(); // menghapus data terakhir
        printData();

        searchData(56); // mencari data
        searchData(7);

        linkedList.clear(); // menghapus data semua
        System.out.println("clear()");
        printData();
    }
    // method penambahan data
    void add(int data) {
        linkedList.add(data);
        System.out.println("add " + data);
    }
    // method menambahkan data dengan index
    void add(int index, int data) {
        linkedList.add(index, data);
        System.out.println("add " + data + " in index: " + index);
    }
    // menambahkan data di awal
    void addFirst(int data) {
        linkedList.addFirst(data);
        System.out.println("add " + data + " at first");
    }
    // menambahkan data di akhir
    void addLast(int data) {
        linkedList.addLast(data);
        System.out.println("add " + data + " at last");
    }
    // menghapus data pertama (secara default)
    void remove() {
        linkedList.remove();
        System.out.println("remove()");
    }
    // menghapus data sesuai indeks
    void remove(int index) {
        System.out.println("remove(" + index + "): "
                + linkedList.get(index) + " was removed from the list"); // mengambil data
        linkedList.remove(index);
    }
    // menghapus data di awal
    void removeFirst() {
        System.out.println("removeFirst(): " +
                linkedList.getFirst() + " was removed from the list");
        linkedList.removeFirst();
    }
    // menghapus data di akhir
    void removeLast() {
        System.out.println("removeLast(): " +
                linkedList.getLast() + " was removed from the list");
        linkedList.removeLast();
    }
    // pencarian data
    static void searchData(int mKey){
        if(linkedList.indexOf(mKey)!=-1){ // proses pencarian data
            System.out.println("Index of: " + mKey + "= " + linkedList.indexOf(mKey));
        }else{
            System.out.println(mKey + " not found");
        }
    }
    // mencetak data
    static void printData() {
        // jika data tidak kosong
        if (!linkedList.isEmpty()) {
            // proses pencetakan data
            for (int mData : linkedList) {
                System.out.print(mData+" ");
            }
            System.out.println();
        } else {// data kosong
            System.out.println("no data here");
        }
    }
}