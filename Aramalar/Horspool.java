package Aramalar;

import java.util.HashMap;
import java.util.Scanner;

public class Horspool {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        

        // Metin ve aranan kelimeyi al
        do {
            System.out.println("Horspool programına hosgeldiniz.");
            System.out.println("Horspool arama algoritmasi ile metin araması yapabilirsiniz.");
            System.out.println("Genel metin aramalarinda bu algoritma kullanilir");
            System.out.print("Metni girin: ");
            String metin = klavye.nextLine();

            System.out.print("Aranacak kelimeyi girin: ");
            String aranan = klavye.nextLine();

            int sonuc = horspoolAra(metin, aranan);

            if (sonuc != -1) {
                System.out.println("Kelime bulundu! İndeks: " + sonuc);
            } else {
                System.out.println("Kelime bulunamadı!");
            }

            // Devam etmek istiyor mu kontrol et
            int devamSecimi = Aletler.GenelGecer.devamEt();
            if (devamSecimi != 1) {
                System.out.print("\033\143"); // Ekranı temizle
                System.out.println("Bir üst menüye dönülüyor...");
                break;
            }
            System.out.print("\033\143"); // Ekranı temizle
        } while (true);
    }

    public static int horspoolAra(String metin, String aranan) {
        if (aranan.isEmpty() || metin.isEmpty() || aranan.length() > metin.length()) {
            return -1;
        }

        HashMap<Character, Integer> kaydirmaTablosu = kaydirmaTablosuOlustur(aranan);

        int m = metin.length();
        int n = aranan.length();
        int i = n - 1;

        while (i <= m - 1) {
            int j = 0;
            while (j <= n - 1 && aranan.charAt(n - 1 - j) == metin.charAt(i - j)) {
                j++;
            }

            if (j == n) {
                return i - n + 1; // Kelime bulundu
            } else {
                // Kaydırma miktarını hesapla
                char karakter = metin.charAt(i);
                int kaydirmaMiktari = kaydirmaTablosu.getOrDefault(karakter, n);
                i += kaydirmaMiktari;
            }
        }

        return -1; // Kelime bulunamadı
    }

    private static HashMap<Character, Integer> kaydirmaTablosuOlustur(String aranan) {
        HashMap<Character, Integer> kaydirmaTablosu = new HashMap<>();
        int n = aranan.length();

        for (int i = 0; i < n - 1; i++) {
            kaydirmaTablosu.put(aranan.charAt(i), n - 1 - i);
        }

        return kaydirmaTablosu;
    }
}