package Sayilar;

import java.util.Scanner;

public class TetranacciSayilar {
    /*
     * Tetranacci sayilar 
     */

    public static void main(String[] args) {
        System.out.println("Tetranacci sayilar programina hosgeldiniz!");
        System.out.println("Tetranacci sayilari sonraki sayinin onceki 4 sayinin toplamina esit olarak giden sayidirlar");
        System.out.println("Ornegin: 0, 1, 1, 2, 4, 8, 15, 29 sayilarindadir");
        System.out.print("Kacinci tetranacci sayisina kadar listeleyelim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.print(tetranacciBul(i) + " ");
        }
        System.out.println();

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    private static int tetranacciBul(int n)
    {
        // ana durumlar
        if (n == 0)
            return 0;
        
        if (n == 1 || n == 2)
            return 1;
        
        if (n == 3)
            return 2;
        //Alt durumlar
        else
            return tetranacciBul(n - 1) + 
                   tetranacciBul(n - 2) + 
                   tetranacciBul(n - 3) + 
                   tetranacciBul(n - 4);
    }

}
