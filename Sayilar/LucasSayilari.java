package Sayilar;

import java.util.Scanner;

public class LucasSayilari {
    /*
     * Lucas sayıları Fibonacci sayılarına benzer.
     * Lucas sayıları da kendisinden hemen önceki iki terimin toplamı olarak tanımlanır
     * Farklari ise ilk iki terim 2 ve 1 iken Fibonacci sayılarında ilk iki terim sırasıyla 0 ve 1'dir
     */

    public static void main(String[] args) {
        System.out.println("Lucas sayilar programina hosgeldiniz!");
        System.out.print("Lucas sayilar ilk iki terimi 2 ve 1 olan fibonacci serisi gibi ");
        System.out.print("her bir terim onceki iki terimin toplami olarak tanimlanir\n");
        System.out.println("Ornegin: 2, 1, 3, 4, 7, 11, 18 Lucas sayilarindadir");
        System.out.print("Kacinci lucas sayisina kadar listeleyelim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.print(lucas(i) + " ");
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

    public static int lucas(int n) 
    { 
  
        // ana durumlar
        if (n == 0) 
            return 2; 
        if (n == 1) 
            return 1; 
  
        // alt durumlar 
        return lucas(n - 1) +  
               lucas(n - 2); 
    } 
  


}
