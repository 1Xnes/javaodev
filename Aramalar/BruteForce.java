package Aramalar;
import java.util.Scanner;

public class BruteForce {
   

    public static void main(String[] args) {
        System.out.println("Kelime Arama Programina hosgeldiniz!");
        System.out.println("Brute Force Arama : secenekleri tek tek deneyerek bulan algoritmadir.");
        String[] kelimeler = {"elma", "armut", "muz", "çilek", "kiraz"}; // Kelime listesi
        System.out.println("Oncelikle listemizi yazdiralim..");

        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

        Scanner klavye = new Scanner(System.in);
        System.out.print("Aranacak kelimeyi giriniz: ");
        String arananKelime = klavye.nextLine();

        boolean bulundu = false;
        for (String kelime : kelimeler) {
            if (kelime.equalsIgnoreCase(arananKelime)) { // Kelime bulundu
                bulundu = true;
                break;
            }
        }

        if (bulundu) {
            System.out.println("Aranan kelime '" + arananKelime + "' listede mevcut.");
        } else {
            System.out.println("Aranan kelime '" + arananKelime + "' listede bulunamadı.");
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
}