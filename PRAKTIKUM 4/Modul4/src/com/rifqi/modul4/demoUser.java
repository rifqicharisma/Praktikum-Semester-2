package com.rifqi.modul4;

public class demoUser {
    public static void main(String[] args) {
        /*
        membuat objek dengan diisi parameternya
         */
        user user = new user("sibejo", "lalalala");
        System.out.println("Username : "+user.userName);
        System.out.println("Password: "+user.password);
    }
}
