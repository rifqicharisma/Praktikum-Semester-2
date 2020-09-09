package Soal1;

public class Sorting {
    public void sort(int[] data){
        for (int i = 0; i < (data.length-1); i++) {
            int min = i;
            for (int j = (i+1); j < data.length; j++) {
                if (data[j] < data[min]) min = j;
            }
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }

    public void printData(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
