package com.rifqialfinnur;

import java.util.Random;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        BinnaryTree binnaryTree = new BinnaryTree();
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        System.out.println("Array Acak\t:");
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            System.out.print(" "+ x + " ");
            binnaryTree.add(x);
        }
        System.out.println();
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
