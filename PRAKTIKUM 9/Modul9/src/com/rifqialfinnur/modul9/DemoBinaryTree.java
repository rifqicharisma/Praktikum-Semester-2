package com.rifqialfinnur.modul9;

public class DemoBinaryTree {
    public static void main(String[] args) {
        BinnaryTree binnaryTree = new BinnaryTree();
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        // menambahkan node atau elemen
        binnaryTree.add(5);
        binnaryTree.add(3);
        binnaryTree.add(7);
        binnaryTree.add(6);
        binnaryTree.add(8);
        binnaryTree.add(10);

        // output DFS
        System.out.println("Dept First Search (Pre Order)\t: ");
        binnaryTree.traversePreOrder(binnaryTree.root);
        System.out.println();

        // Print Binary Tree
        System.out.println("Print Binary Tree\t: ");
        printBinaryTree.printNode(binnaryTree.root);

        System.out.println("Is balanced\t: " + binnaryTree.isBalanced(binnaryTree.root));

        // balancing tree
        System.out.println("\nBalancing a tree\t: ");
        binnaryTree.balanceTree();

        System.out.println("Dept First Search (Pre Order)\t: ");
        binnaryTree.traversePreOrder(binnaryTree.root);
        System.out.println();

        // Print Binary Tree
        System.out.println("Print Binary Tree\t: ");
        printBinaryTree.printNode(binnaryTree.root);

        System.out.println("Is balanced\t: " + binnaryTree.isBalanced(binnaryTree.root));

        // output DFS
        System.out.println("Dept First Search (In Order)\t: ");
        binnaryTree.traverseInOrder(binnaryTree.root);
        System.out.println("\nDept First Search (Pre Order)\t: ");
        binnaryTree.traversePreOrder(binnaryTree.root);
        System.out.println("\nDept First Search (Post Order)\t: ");
        binnaryTree.traversePostOrder(binnaryTree.root);

        // detele
        System.out.println("\ndelete value\t: " + 3);
        binnaryTree.delete(3);

        // output
        System.out.println("Bread First Search\t: ");
        binnaryTree.traverseLevelOrder();
        System.out.println();

        // get size
        System.out.println("Size of binary tree\t" + binnaryTree.getSize());

        // find element
        System.out.println("Find node 12\t: " + binnaryTree.find(9));

        // tree balanced
        System.out.println("Is balanced\t: " + binnaryTree.isBalanced(binnaryTree.root));

    }
}
