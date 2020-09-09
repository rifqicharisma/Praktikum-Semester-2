package com.rifqialfinnur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintBinaryTree {
    // method untuk mencetak node
    public static void printNode(Node root){
        int maxLevel = PrintBinaryTree.maxLevel(root);
        printNodeInternel(Collections.singletonList(root), 1, maxLevel);
    }
    // method untuk mencetak spasi otomatis
    private static void printWhiteSpces(int count){
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    // method untuk mencetak level dari node
    private static int maxLevel(Node node){
        if(node == null)
            return 0;
        return Math.max(PrintBinaryTree.maxLevel(node.left), PrintBinaryTree.maxLevel(node.right)) + 1;
    }
    // jika elemen bernilai null, maka tidak akan dicetak
    private static boolean isAllElementsNull(List list){
        for(Object object : list){
            if(object!= null)
                return false;
        }
        return true;
    }
    // mnencetak list dari node
    private static void printNodeInternel(List<Node> nodes, int level, int maxLevel){
        if(nodes.isEmpty() || PrintBinaryTree.isAllElementsNull(nodes)) return;

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor-1, 0)));
        int firstSpaces = (int) Math.pow(2,(floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        PrintBinaryTree.printWhiteSpces(firstSpaces);
        // list node
        List<Node> newNodes = new ArrayList<Node>();
        for(Node node : nodes){
            // jika node tidak bernilai null, node akan mencetak nilainya
            if(node != null){
                System.out.print(node.value);
                newNodes.add(node.left);
                newNodes.add(node.right);
            }else{
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
            PrintBinaryTree.printWhiteSpces(betweenSpaces);
        }
        System.out.println("");
        // mencetak binary tree dengan white space
        for (int i = 1; i <= edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                PrintBinaryTree.printWhiteSpces(firstSpaces-i);
                // jika bernilai null akan mencetak line dari node
                if(nodes.get(j) == null){
                    PrintBinaryTree.printWhiteSpces(edgeLines + edgeLines + i + 1);
                    continue;
                }
                // jika node tidak bernilai null akan mencetak /
                if(nodes.get(j).left != null)
                    System.out.print("/");
                else
                    PrintBinaryTree.printWhiteSpces(1);
                // menghitung dari node
                PrintBinaryTree.printWhiteSpces(i + i - 1);
                if(nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    PrintBinaryTree.printWhiteSpces(1);

                PrintBinaryTree.printWhiteSpces(edgeLines + edgeLines - i);
            }
            System.out.println("");
        }
        // mencetak node internel
        printNodeInternel(newNodes, level+1, maxLevel);
    }
}
