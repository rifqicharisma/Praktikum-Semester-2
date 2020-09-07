import java.util.*;
public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maksimum, jumlah, i, array[];
        array = new int[3];
        System.out.println("========== Menghitung Nilai Rata-rata dan Nilai Maksimal ===========");
        for(i = 0; i < 3; i++){
            System.out.print("Masukkan Nilai ke-"+ (i+1)+" : ");
            array[i] = scanner.nextInt();
        }

        maksimum = array[0];
        for (i = 0; i < 3; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
            }
        }
        float rata = (array[0]+array[1]+array[2])/3;
        System.out.println("Nilai Rata-ratanya adalah : "+rata);
        System.out.println("Nilai Maksimumnya adalah : "+maksimum);
    }
}
