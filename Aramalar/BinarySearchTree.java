package Aramalar;

import java.util.Scanner;

public class BinarySearchTree {
    /*
     * Binary Search Tree programina hoSgeldiniz!
     */

    // Node sinifi
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Binary Search Tree sinifi
    class BST {
        Node root;

        // Ağacin kokunu baSlat
        BST() {
            root = null;
        }

        // Ağaca veri ekleme
        void insert(int data) {
            root = insertRec(root, data);
        }

        // Ağaca rekursif olarak veri ekleme
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data)
                root.left = insertRec(root.left, data);
            else if (data > root.data)
                root.right = insertRec(root.right, data);

            return root;
        }

        // Ağacin içinde eleman arama
        boolean search(int data) {
            return searchRec(root, data);
        }

        // Rekursif olarak eleman arama
        boolean searchRec(Node root, int data) {
            if (root == null)
                return false;
            if (root.data == data)
                return true;
            if (root.data > data)
                return searchRec(root.left, data);
            return searchRec(root.right, data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Tree programina hosgeldiniz!");
        System.out.println("Binary Search Tree (İkili arama ağaci): Sirali bir diziyi agaca ekleme, arama, silme, döngüleme) gibi islemlerle degerine bakarak giden bir arama turudur.");
        System.out.println("oncelikle dizimizi alalim...");

        int[] dizi = Aletler.GenelGecer.diziAl();

        BinarySearchTree bstProgram = new BinarySearchTree();
        BST bst = bstProgram.new BST();

        // Dizideki elemanlari BST'ye ekle
        for (int eleman : dizi) {
            bst.insert(eleman);
        }

        System.out.print("Simdi de hangi elemani arayalim, giriniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        // Belirtilen elemani ara
        if (bst.search(sayi)) {
            System.out.println(sayi + " elemani bulundu.");
        } else {
            System.out.println(sayi + " elemani bulunamadi.");
        }

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
    }
}