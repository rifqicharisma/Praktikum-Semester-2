package Searching;

public class DemoSequential {
    public static void main(String[] args) {
        // membuat objek
        Sequential sequential = new Sequential();
        int[] data = {123,324,23,4,6,7,12,17};
        // pemanggilan algoritma
        sequential.search(data, 7);
    }
}