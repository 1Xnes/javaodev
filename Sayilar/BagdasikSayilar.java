package Sayilar;
import java.util.Arrays;
import java.util.Scanner;

public class BagdasikSayilar {
    /*
     * Bagdasik sayilar iki pozitif tam sayidan her birinin kendisi haric pozitif bolenlerinin toplamı diğer sayıyı veriyorsa bu sayilar ikilisi bagdasik (amicable) sayidir
     */

    public static void main(String[] args) {
        System.out.println("Bagdasik sayilar programina hosgeldiniz!");
        System.out.println("Bagdasik sayilar iki pozitif tam sayidan her birinin kendisi hariç pozitif bolenlerinin toplamı diğer sayıyı veriyorsa bu sayilar ikilisi bagdasik (amicable) sayidir");
        System.out.println("Ornegin: 220, 284 sayilarindadir");
        System.out.print("Hangi iki sayi bagdasik mi degil mi diye bakalim?\n1. Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi1 = klavye.nextInt();
        System.out.print("2. Sayiniz: ");
        int sayi2 = klavye.nextInt();
        if (bagdasikMi(sayi1, sayi2)) {
            System.out.println(sayi1 + " ve " + sayi2 + " bagdasik sayilardirlar.");
        } else {
            System.out.println(sayi1 + " ve " +sayi2 + " bagdasik sayi degildirler.");
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

    public static boolean bagdasikMi(int sayi1, int sayi2) {
        int bolenToplami1 = 0;
        int bolenToplami2 = 0;
    
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                bolenToplami1 += i;
            }
        }
    
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                bolenToplami2 += i;
            }
        }
    
        return bolenToplami1 == sayi2 && bolenToplami2 == sayi1;
    }
}
