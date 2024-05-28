package Aramalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrArayicilar {

    public static void main(String[] args) {
        // Hazır string listesi
        List<String> kelimeler = new ArrayList<>();
        kelimeler.add("armut");
        kelimeler.add("cilek");
        kelimeler.add("elma");
        kelimeler.add("karpuz");
        kelimeler.add("muz");
        System.out.println("String Aramalar programina hosgeldiniz!");
        System.out.println("Baslamadan once listemizi (kelimeler) sıralayalim.");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
        Scanner klavye = new Scanner(System.in);

        do {
            System.out.println("\nHangi algoritmayı kullanmak istersiniz?");
            System.out.println("1. Linear Search (Doğrusal Arama)");
            System.out.println("2. Binary Search (İkili Arama) - Liste sıralı olmalıdır!");

            System.out.print("Seçiminiz (Çıkmak için 0): ");

            int secim = klavye.nextInt();
            klavye.nextLine(); // Enter karakterini oku

            if (secim == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            System.out.print("Aranacak kelimeyi girin: ");
            String arananKelime = klavye.nextLine();

            int sonuc = -1;

            if (secim == 1) {
                sonuc = linearSearch(kelimeler, arananKelime);
            } else if (secim == 2) {
                // İkili arama için liste sıralı olmalı
                kelimeler.sort(String::compareToIgnoreCase); // Listeyi sıralayalım
                sonuc = binarySearch(kelimeler, arananKelime);
            } else {
                System.out.println("Geçersiz seçim!");
            }

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

    // Linear Search (Doğrusal Arama)
    public static int linearSearch(List<String> liste, String aranan) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(aranan)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (İkili Arama) - Liste sıralı olmalı!
    public static int binarySearch(List<String> liste, String aranan) {
        int sol = 0;
        int sag = liste.size() - 1;

        while (sol <= sag) {
            int orta = (sol + sag) / 2;

            int karsilastirmaSonucu = liste.get(orta).compareToIgnoreCase(aranan);

            if (karsilastirmaSonucu == 0) {
                return orta;
            } else if (karsilastirmaSonucu < 0) {
                sol = orta + 1;
            } else {
                sag = orta - 1;
            }
        }
        return -1;
    }
}