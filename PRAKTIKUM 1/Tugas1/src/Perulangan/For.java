package Perulangan;

public class For {
    /*
    program untuk memahami perulangan for
    program akan mencetak angka sebanyak 10 kali dan kata sebanyak 3 kali
     */
    public static void main(String[] args) {
        for(int x = 0; x < 3; x++) {
            System.out.print("Halo\n");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka : " + i);
        }
    }
}
