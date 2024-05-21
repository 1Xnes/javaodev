package Sayilar;

import java.util.Scanner;

public class DostSayilar {
    /* dost sayilar ingilizcede amicable numbers olarak gecer */
    /*
     * Iki sayi birbirinin kendisi haric bolenleri toplamina esitse dost sayidirlar
     */

    public static void main(String[] args) {
        System.out.println("Dost sayilar programina hosgeldiniz");
        System.out.println("Iki sayi birbirinin kendisi haric bolenleri toplamina esitse dost sayidirlar");
        System.out.println("Ornegin: 220 ve 284 sayilarindadir");
        System.out.print("Kacinci dost sayisina kadar listeleyelim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        long limit = 999999999;
        int sayac = 0;
        for (int i = 2; i < limit; i++) {
            int numara1 = bolenlerToplami(i);
            if (numara1 > i && numara1 < limit) {
                int numara2 = bolenlerToplami(numara1);
                if (numara2 == i) {
                    System.out.println("(" + i + ", " + numara1 + ")");
                    sayac++;
                    if (sayac >= sayi) break;
                }
            }
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

    // Bir sayının kendisi hariç pozitif bölenlerinin toplamını hesaplayan fonksiyon
    private static int bolenlerToplami(int n) {
        int sum = 1;
        int max = (int) Math.sqrt(n);
        for (int i = 2; i <= max; ++i) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}