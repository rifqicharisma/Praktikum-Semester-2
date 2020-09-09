package com.rifqialfinnur;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BinnaryTree {
    Node root;
    // mendeklarasikan constructor
    public BinnaryTree(int value) {
        root = new Node(value);
    }

    public BinnaryTree(){
        root = null;
    }

    // membuat method untuk menambah elemen / node binary tree
    public void add(int value){
        root = addRecursive(root, value);
    }
    // untuk menambahkan kode recursive
    public Node addRecursive(Node current, int value){
        // jika bernilai null, akan mengembalikan nilai node
        if(current==null){
            return new Node(value);
        }
        // mengecek kondisi dari value
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else if( value > current.value){
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    // method untuk mencari elemen / node pada binary tree
    public boolean find(int value){
        return constrainNodeRecursive(root, value);
    }
    // proses pencareian elemen
    public boolean constrainNodeRecursive(Node current, int value){
        // jika elemen bernilai null maka mengembalikan nilai false
        if (current==null){
            return false;
        }
        if(value == current.value){
            return true;
        }
        return value < current.value
                ? constrainNodeRecursive(current.left, value) : constrainNodeRecursive(current.right, value);
    }
    // method untuk menghapus elemen
    public void delete(int value){
        root = deleteRecursive(root, value);
    }
    // penghapusan elemen
    private Node deleteRecursive(Node current, int value){
        if(current==null){
            return null;
        }

        if(value==current.value){
            // jika element nya tidak memiliki child
            if(current.left==null&& current.right==null){
                return null;
            }

            // jika elemennya memiliki 1 child
            if(current.right == null){
                return current.left;
            }

            if(current.left==null){
                return current.right;
            }

            // jika elemen memilili 2 child
            int smallestValue = findSmallestValue(current.right);
            // pemberian nilai
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        // jika tidak memiliki child
        if(value < current.value){
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }
    // mencari elemen terkecil
    private int findSmallestValue(Node root){
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    // method untuk mendapatkan ukuran binary tree
    public int getSize(){
        return getSizeRecursive(root);
    }
    // mengetahui ukuran elemen
    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }

    // method untuk mengecek keseimbangan tree
    public boolean isBalanced(Node root){
        return isBalanceRecursive(root, -1).isBalanced;
    }
    // deklarasi constructor result
    private class Result {
        private boolean isBalanced;
        private int height;

        public Result(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }
    // jika tree seimbang
    private Result isBalanceRecursive(Node node, int depth) {
        if(node==null){
            return new Result(true, -1);
        }
        Result leftSubtreeResult = isBalanceRecursive(node.left, depth+1);
        Result rightSubtreeResult = isBalanceRecursive(node.right, depth+1);

        boolean isBalanced = Math.abs(leftSubtreeResult.height - rightSubtreeResult.height) <= 1;
        boolean subtreesAreaBalanced = leftSubtreeResult.isBalanced && rightSubtreeResult.isBalanced;
        int height = Math.max(leftSubtreeResult.height, rightSubtreeResult.height) + 1;

        return new Result(isBalanced && subtreesAreaBalanced, height);
    }

    // method dept first search
    // in order
    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    // pre order
    public void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // post oder
    public void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.value);
        }
    }

    // Method bread first search
    // level order

    public void traverseLevelOrder(){
        // penambahan metode linked list
        if(root == null){
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        // jika node kosong
        while (!nodes.isEmpty()){
            Node node = nodes.remove();
            System.out.print(" " + node.value);
            // jika salah satu node kosong
            if (node.left != null){
                nodes.add(node.left);
            }

            if(node.right != null){
                nodes.add(node.right);
            }
        }
    }
    /*
    PRAKTIKUM 10, LANJUTAN
     */
    // balanced binary tree
    public void balanceTree(){
        root = buildTree(root);
    }

    // moethod untuk membentuk keseimbangan pohon
    private Node buildTree(Node root){
        Vector<Node> nodes = new Vector<>();
        storeBSTNodes(root,nodes);
        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n-1);
    }
    // membuat diagram untuk binary tree
    private void storeBSTNodes(Node root, Vector<Node> nodes){
        if(root == null) return;

        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }
    // method untuk mencetak tree sampai ke berapa
    private Node buildTreeUtil(Vector<Node> nodes, int start, int end){
        // jika start > end maka akan berhenti
        if(start > end) return null;
        int mid = (start + end)/2;
        Node node = nodes.get(mid);

        node.left = buildTreeUtil(nodes, start, mid-1);
        node.right = buildTreeUtil(nodes, mid+1, end);
        return node;
    }
}
