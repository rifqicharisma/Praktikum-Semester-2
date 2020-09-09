package Soal1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class soal2 {
    static LinkedList<Integer> gerbong = new LinkedList<>();
    static LinkedList<Integer> penumpang = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        soal2 soal2 = new soal2();

        boolean menu = false;
        do{
            System.out.println("Welcome to Kereta Auto");
            System.out.println("1. Create new train");
            System.out.println("2. Add train");
            System.out.println("3. Add Passenger");
            System.out.println("4. Show the train status");
            System.out.println("5. Departs the train");
            System.out.print("Choose your option : ");
            String option = br.readLine();

            switch (option){
                case "1":
                  clear();
                    System.out.println("Masukkan jumlah gerbong : ");
                    int jmlGerbong = Integer.parseInt(br.readLine());
                    for (int i = 0; i < jmlGerbong; i++) {
                        soal2.add();
                    }
                    System.out.println("Gerbong "+jmlGerbong+ " was added");
                    System.out.println("\n Press Any Key to Continue");
                    System.in.read();
                    break;

                case "2":
                    boolean menuGerbong = false;
                    do{
                        System.out.println();
                        System.out.println("1. Add First");
                        System.out.println("2. Add Mid");
                        System.out.println("3. Add Last");
                        System.out.println("3. Add a carriage custom");
                        System.out.print("Your Option : ");
                        String inputGerbong = br.readLine();
                        switch (inputGerbong){
                            case "1":
                                soal2.addFirst();
                                System.out.println("Successfully Added the front carriage");
                                menuGerbong = true;
                                break;
                            case "2":
                                soal2.addMid();
                                System.out.println("Succesfully Added the Mid Carriage");
                                menuGerbong = true;
                                break;
                            case "3":
                                soal2.addLast();
                                System.out.println("Successfully added the Last carriage");
                                menuGerbong = true;
                                break;
                            case "4":
                                System.out.print("Enter the number of carriages");
                                int wagon = Integer.parseInt(br.readLine());
                                for (int i = 0; i < wagon; i++) {
                                    soal2.add();
                                }
                                System.out.println("Succesfully added "+wagon);
                                menuGerbong = true;
                                break;
                            default:
                                break;
                        }
                    }while (!menuGerbong);
                    System.out.println("\n Press Any Key to Continue");
                    System.in.read();
                    break;
                case "3":
                    System.out.print("Total passenger : ");
                    int totalPass = Integer.parseInt(br.readLine());
                    addPasenger(totalPass);
                    System.out.println("\n Press Any Key to Continue");
                    System.in.read();
                    break;
                case "4":
                    System.out.println("The Statues of Your Train : ");
                    soal2.display();
                    System.out.println("Pasenger : "+passenger());
                    System.out.println("Penumpang maksimal : "+maksimal());
                    System.out.println("Kosong : "+kosong());
                    System.out.println("\n Press Any Key to Continue");
                    System.in.read();
                    break;
                case "5":
                  if (ukuranGerbong()<1){
                      System.out.println("You have no carriage");
                      System.out.println("\n Press Any Key to Continue");
                      System.in.read();
                  }else{
                      System.out.println("The train departs");
                      soal2.display();
                      menu = true;
                  }
                  break;
                case "6":
                    System.out.println("Thanks for using the KAI Access");
                    System.out.println("See you for next Trip");
                    menu = true;
                    break;
                default:
                    break;
            }
        }while (!menu);
    }

    void display(){
        System.out.println("<[M]-");
        int panjang = gerbong.size();
        for (int i = 0; i < panjang; i++) {
            System.out.println("[" + (gerbong.get(i)+1)+"]-");
        }
        System.out.println("/");
    }

    void add(){
        int data = gerbong.size();
        gerbong.add(data);
    }

    void addFirst(){
        int data = gerbong.size();
        int indeks = gerbong.size()/2;
        gerbong.addFirst(data);
    }

    void addMid(){
        int data = gerbong.size();
        int indeks = gerbong.size()/2;
        gerbong.add(indeks,data);
    }

    void addLast(){
        int data = gerbong.size();
        gerbong.addLast(data);
    }

    static void addPasenger(int masukan){
        int tambah = 0;
        if(masukan > kosong()){
            System.out.println("Maaf antrian penuh, silahkan tambah gerbong");
        }else {
            for (int i = 0; i < masukan; i++) {
                penumpang.add(tambah);
            }
            System.out.println(masukan + " was added");
        }
    }

    static int kosong(){
        return maksimal() - passenger();
    }

    static int passenger(){
        return penumpang.size();
    }

    static int maksimal(){
        return gerbong.size()*20;
    }

    static void clear(){
        gerbong.clear();
        penumpang.clear();
    }

    static int ukuranGerbong(){
        return gerbong.size();
    }
}
