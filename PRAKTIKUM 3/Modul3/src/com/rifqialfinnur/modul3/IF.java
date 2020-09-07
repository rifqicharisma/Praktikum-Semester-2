package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your Grade Point Average : ");
        double gpa = scanner.nextDouble();
        if (gpa>=3.5 && gpa <= 4.0){
            System.out.println("Congratulations, ur cumlaude");
        }
    }
}
