package Aramalar;

import java.util.Scanner;

public class BruteForce {
    /*
     * Bruteforce de secenekeleri tek tek deneyerek yapildigindan linear search'e gerekir.
     */

    public static void main(String[] args) {
        System.out.println("Bruteforce Arama programina hosgeldiniz!");
        System.out.println("Brute Force Arama :");
        System.out.println("Oncelikle dizimizi alalim...");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.print("Simdi de hangi elemani arayalim giriniz:");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        
        // Brute force arama algoritması
        int index = bruteForceArama(dizi, sayi);
        
        if (index != -1) {
            System.out.println("Aradiginiz sayi " + sayi + " dizinin " + index + ". indeksinde bulundu.");
        } else {
            System.out.println("Aradiginiz sayi " + sayi + " dizide bulunamadi.");
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

    public static int bruteForceArama(int[] dizi, int sayi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                return i;
            }
        }
        return -1;
    }
}