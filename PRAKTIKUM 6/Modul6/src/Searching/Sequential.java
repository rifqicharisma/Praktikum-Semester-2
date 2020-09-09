package Searching;

public class Sequential {
    // membuat method untuk mengecek data
    private int sequential(int[] data, int key){
        // proses penemuan data
        for (int i = 0; i < data.length; i++) {
            if(data[i]==key)return i;
        }
        return -1;
    }

    public void search(int[] data, int key){
        // proses pencetakan data yang telah ditemukan
        int result = sequential(data, key);
        if (result!=-1){
            System.out.println("Data "+key+" ditemukan pada indeks ke: "+result);
        }else{
            System.out.println("Data "+key+" tidak ditemukan");
        }
    }
}