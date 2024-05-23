package Sayilar;

import java.util.Scanner;

public class DonguselSayilar {
    /*
     * Dongusel sayilar programi
     */

    public static void main(String[] args) {
        System.out.println("Dongusel sayilar programina hosgeldiniz");
        System.out.print("n basamakli bir A tam sayisinin 1'den n'ye kadar olan tum tam sayi katlari"); 
        System.out.print("A ile ayni rakamlardan olusuyorsa (A'nin bir permutasyonu ise) ve bu katlarin rakamlarinin dongusel sirasi"); 
        System.out.print("A ile ayniysa bu sayiya dongusel (cyclic) sayi denir.");
        System.out.println("Ornegin 142857 6 basamakli bir dongusel sayidir");
        System.out.print("Gireceginiz sayinin dongusel olup olmadigini kontrol edelim.?\nSayiniz: ");
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
    public static boolean donguselMi(long N) {
        // Rakam sayısını ve tüm rakamların aynı olup olmadığını kontrol eder.
        long sayi = N;
        int sayac = 0;
        int hane = (int)(sayi % 10);
        boolean hepsiAyni = true;
        while (sayi > 0) {
            sayac++;
            if (sayi % 10 != hane)
                hepsiAyni = false;
            sayi = sayi / 10;
        }
    
        // Tüm rakamlar aynı ise, dongusel sayı olarak kabul edilmez.
        if (hepsiAyni == true)
            return false;
    
        // Eğer rakam sayısı çift ve iki yarım aynı ise, dongusel sayı olarak kabul edilmez.
        if (sayac % 2 == 0) {
            long halfPower = (long)Math.pow(10, sayac / 2);
            long firstHalf = N % halfPower;
            long secondHalf = N / halfPower;
            if (firstHalf == firstHalf && donguselMi(firstHalf))
                return false;
        }
    
        sayi = N;
        while (true) {
            // Aşağıdaki üç satır, bir sayının döngüsel bir şekilde döndürülmesini sağlar.
            long rem = sayi % 10;
            long div = sayi / 10;
            sayi = (long)(Math.pow(10, sayac - 1)) * rem + div;
    
            // Tüm döngüsel dönüşler kontrol edildiğinde ve orijinal sayı döndürüldüğünde döngüden çıkılır.
            if (sayi == N)
                break;
    
            if (sayi % N != 0)
                return false;
        }
    
        return true;
    }

}
