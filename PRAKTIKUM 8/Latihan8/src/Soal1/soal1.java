package Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class soal1 {
    static LinkedList<String> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        soal1 soal1 = new soal1();
        Scanner scanner = new Scanner(System.in);
        String password = null, password2=null;
        String subPass = null, subPass2=null;
        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.println("1. Create a new password");
            System.out.println("2. Encrypt password");
            System.out.println("3. Decrypt password");
            System.out.println("4. Show password");
            System.out.println("5. Exit");
            System.out.print("Your option : ");
            int input = scanner.nextInt();
            if (input==1){
                System.out.print("Create password : ");
                password = scanner.next();
                soal1.add(password);
            }else if (input==2){
                subPass = password.substring(password.length()-3, password.length()-0);
                subPass2 = password.substring(0, password.length()-3);
                password2 = subPass+"#"+subPass2;
                System.out.println(password2);
                System.out.println("Password was encrypted");
            }else if (input==3){
                subPass = password.substring(0, 4);
                subPass2 = password.substring(4, password.length()-0);
                password2 = subPass2+"#"+subPass;
                System.out.println(password2);
            }else if (input==4){
                System.out.println(password2);
            }else if (input==5){
                System.exit(0);
            }
        }
    }
    void add(String data){
        linkedList.add(data);
        System.out.println("Password was added");
    }
    void addFirst(String data) {
        linkedList.addFirst(data);
        System.out.println("add " + data + " at first");
    }

    void remove(int index) {
        System.out.println("remove(" + index + "): "
                + linkedList.get(index) + " was removed from the list"); // mengambil data
        linkedList.remove(index);
    }

    static void printData(String data) {
        if (!linkedList.isEmpty()) {
            // proses pencetakan data
            for (String mData : linkedList) {
                System.out.print(mData);
            }
            System.out.println();
        } else {
            System.out.println("no data here");
        }
    }

}
