package Sayilar;
import java.util.Arrays;
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
        if (donguselMi(sayi)) {
            System.out.println(sayi + " bir dongusel sayidir");
        } else {
            System.out.println(sayi + " bir dongusel sayi degildir");
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
    public static boolean donguselMi(long N) {
        // N sayısını string olarak al
        String numStr = Long.toString(N);
        int len = numStr.length();

        // 2'den n'e kadar çarpanlarını kontrol et
        for (int i = 2; i <= len; i++) {
            long multiple = N * i;
            if (!permutasyonuMu(numStr, Long.toString(multiple))) {
                return false;
            }
        }

        return true;
    }

    public static boolean permutasyonuMu(String a, String b) {
        // Eğer uzunluklar farklıysa, permütasyon olamaz
        if (a.length() != b.length()) {
            return false;
        }

        // Karakterleri sıralayıp karşılaştır
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }

}
