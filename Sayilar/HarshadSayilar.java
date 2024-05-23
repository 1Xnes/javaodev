package Sayilar;

import java.util.Scanner;

public class HarshadSayilar {
    /*
     * Harshad Sayilar
     */

    public static void main(String[] args) {
        System.out.println("Harshad sayilar programina hosgeldiniz!");
        System.out.println("Harshad sayilar rakamlari toplamina tam bolunen sayilara denir");
        System.out.println("Ornegin: 120;\n 1+2=3\n 120%3=0");
        System.out.print("Sayinizi giriniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        if (harshadMi(sayi)) {
            System.out.println(sayi + " harshad sayidir");
        } else {
            System.out.println(sayi + " harshad sayi degildir");
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

    public static boolean harshadMi(int sayi) {
        int rakamToplami = 0;

        int rakam = sayi;
        while (rakam > 0) {
            rakamToplami += rakam % 10;
            rakam = rakam / 10;
        }

        return (sayi % rakamToplami == 0);
    }

}
