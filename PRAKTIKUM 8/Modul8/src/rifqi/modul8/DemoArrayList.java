package rifqi.modul8;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    // membuat objek dari class array list
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        DemoArrayList demoArrayList = new DemoArrayList(); // membuat objek dari class demo array list
        demoArrayList.printData();

        demoArrayList.add("Bakso");     // menambahkan data
        demoArrayList.add("Seblak");
        demoArrayList.add("Mie Naga");
        demoArrayList.printData();

        demoArrayList.add(1, "Ayam Kaf");   // menambahkan data dengan indeks
        demoArrayList.printData();

        String[] indomie = {"Mie Aceh", "Mie Korea Spicy", "Mie Bakar"};
        demoArrayList.addAll(indomie); // menambahkan semua data
        demoArrayList.printData();

        demoArrayList.get(3); // mengambil data di indeks ke 3
        demoArrayList.remove(3); // menghapus data indeks ke 3
        demoArrayList.printData();

        demoArrayList.searchingData("Mie Aceh"); // mencari data
        demoArrayList.searchingData("Burger");

        arrayList.clear(); // menghapus semua data
        System.out.println("clear()");
        demoArrayList.printData();
    }
    // method menambahkan data
    void add(String data) {
        arrayList.add(data);
        System.out.println("add " + data);
    }
    // method menambakan data dengan indeks
    void add(int index, String data) {
        arrayList.add(index, data);
        System.out.println("add " + data + " in index : " + index);
    }
    // method menambahkan semua data
    void addAll(String[] listData) {
        arrayList.addAll(Arrays.asList(listData));
        System.out.println("addAll(" + Arrays.toString(listData) + ")");
    }
    // mengambil data sesuai indeks
    void get(int index) {
        System.out.println("get(" + index + ")" + arrayList.get(index));
    }
    // menghapus data sesuai indeks
    void remove(int index) {
        System.out.println("remove(" + index + "): "
                + arrayList.get(index) + " was removed from the list"); // mendapatkan data terlebih dahulu
        arrayList.remove(index);
    }
    // method pencarian data
    void searchingData(String mKey) {
        // indexOf = cari data
        if (arrayList.indexOf(mKey) != -1) {
            // jika data tidak kosong
            System.out.println("Index of: " + mKey + "= " + arrayList.indexOf(mKey));
        } else {
            // data tidak ketemu
            System.out.println(mKey + " Data not found");
        }
    }
    // method mencetak data
    void printData() {
        if (!arrayList.isEmpty()) { // jika data tidak kosong
            for (String mData : arrayList) {
                // mencetak data dengan ditambahkan koma dibagian akhir
                if (mData.equals(arrayList.get(arrayList.size() - 1))) { // kode agar koma tidak kelebihan
                    System.out.print(mData);
                } else {
                    System.out.print(mData + ", ");
                }
            }
            System.out.println();
        } else { // data kosong
            System.out.println("no data here");
        }
    }
}
