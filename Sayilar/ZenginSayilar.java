package Sayilar;

import java.util.Scanner;

public class ZenginSayilar {
    /*
     * Kendisi hariç pozitif tam sayı bölenlerinin toplamı kendisinden büyük olan sayılara zengin (abundant) sayı denir
     */

    public static void main(String[] args) {
        System.out.println("Zengin sayilar programina hosgeldiniz!");
        System.out.println("Zengin sayilar kendisi haric pozitif tam sayi bolenleri toplami kendisinden buyuk olan sayidirlar");
        System.out.println("Ornegin: 12, 18, 20, 24, 36 sayilarindadir");
        System.out.print("Hangi sayi zengin mi degil mi diye bakalim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        zenginMi(sayi);
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    private static void zenginMi(int n)
    {
        // bolenler toplamini saklamak icin
        int toplam = 0;
 
        // numaralar arasinda donme
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
 
        // sayinin bolenleri toplami kendisinden buyukse:
        if (toplam > n) {
            System.out.println(n + " sayisi zengin bir sayidir.");
        }
        else {
            System.out.println(n + " sayisi zengin bir sayi degildir.");
        }
    }


}
