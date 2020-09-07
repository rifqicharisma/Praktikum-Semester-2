package com.rifqialfinnur.modul3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your GPA : ");
        float gpa = scanner.nextFloat();
        if (gpa >= 3.5 && gpa <= 4.0){
            System.out.println("Congratulations, ur Cumlaude");
        }else{
            System.out.println("Your are normal people guys..., don't worry");
        }
    }
}
