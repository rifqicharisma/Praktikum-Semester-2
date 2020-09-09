package com.rifqialfinnur;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinnaryTree binnaryTree = new BinnaryTree();
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        String word = null;
        int ascii;
        // input kata
        System.out.print("Masukkan kata : ");
        word = scanner.next();
        char[] karakter = word.toCharArray();
        System.out.println();
        System.out.println("ASCII nya adalah : ");
        // cetak ascii
        for(char e : karakter){
            System.out.print((int)e+" ");
            binnaryTree.add((int)e);
        }
        System.out.println();
        System.out.println("Print Binary Tree : ");
        printBinaryTree.printNode(binnaryTree.root);
        System.out.println();
        System.out.println("Is balanced\t: " + binnaryTree.isBalanced(binnaryTree.root));

        // balancing tree
        System.out.println("\n<-----BALANCING A TREE----->");
        binnaryTree.balanceTree();

        // Print Binary Tree
        System.out.println("Print Binary Tree\t: ");
        printBinaryTree.printNode(binnaryTree.root);

        System.out.println("Is balanced\t: " + binnaryTree.isBalanced(binnaryTree.root));
    }
}
