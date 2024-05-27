package Sayilar;

import java.util.Scanner;

public class TauSayilar {
    /*
     * Tau sayi pozitif bolen sayisina tam bolen sayidir
     */

    public static void main(String[] args) {
        System.out.println("Tau sayilar programina hosgeldiniz!");
        System.out.println("tau sayilar pozitif tam sayilarin pozitif bölenlerinin sayisidir");
        System.out.println("Ornegin: 12 sayisinin bolenleri  1,2,3,4,6,12 oldugundan 6 boleni vardır, 6'ya da tam bolunur o yuzden taudur");
        System.out.print("Hangi sayi tau sayi mi degil mi diye bakalim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        tauMu(sayi);
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }



    
    public static void tauMu(int sayi) {
        //bolen sayisi bulma
        int sayac = 0;
        for(int i = 1; i <= sayi; i++) {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        //bolen sayisina tam bolunuyor mu kontrolu
        if(sayi % sayac == 0) {
            System.out.println(sayi + " bir tau sayidir.");
        }
        else {
            System.out.println(sayi + " bir tau sayi degildir.");
        }
    }

}