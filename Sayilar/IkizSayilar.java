package Sayilar;

import java.util.Scanner;

public class IkizSayilar {
    /*
     * Ikiz Sayilar
     */
    
    public static void main(String[] args) {
        System.out.println("Ikiz sayilar programina hosgeldiniz!");
        System.out.println("Ikiz sayilar aralarinda 2 fark olan asal sayilardir");
        System.out.println("Ornegin: 3-5,   5-7,    11-13,  17-19 ikiz sayilarindadir");
        System.out.print("Hangi iki sayi ikiz mi degil mi diye bakalim?\n1. Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi1 = klavye.nextInt();
        System.out.print("2. Sayiniz: ");
        int sayi2 = klavye.nextInt();
        if(Math.abs(sayi1 - sayi2) == 2 && LasaSayilar.asalMi(sayi1)&&LasaSayilar.asalMi(sayi2)) {
            System.out.println(sayi1 + "-" + sayi2 + " ikiz sayidirlar.");
        }
        else {
            System.out.println(sayi1 + "-" + sayi2 + " ikiz sayi degildirler.");
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

