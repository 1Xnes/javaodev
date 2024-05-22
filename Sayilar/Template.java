package Sayilar;

import java.util.Scanner;

public class Template {
    /*
     * Template
     */

    public static void main(String[] args) {
        System.out.println("Template sayilar programina hosgeldiniz");
        System.out.println("template sayidirlar");
        System.out.println("Ornegin: ... sayilarindadir");
        System.out.print("?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        

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
