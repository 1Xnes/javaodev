package Aramalar;

import java.util.ArrayList;
import java.util.List;

public class Prufer {
    /*
     * Template Prufer Dizilimi Algoritmasi
     */

    // Agaci Prufer koduna dönusturme
    public static List<Integer> agaciPruferKodunaDonustur(int[][] agac, int n) {
        int[] derece = new int[n];
        for (int[] kenar : agac) {
            derece[kenar[0]]++;
            derece[kenar[1]]++;
        }

        List<Integer> pruferKod = new ArrayList<>();
        int kenarIndeksi = 0; // Eklenen satir
        for (int i = 0; i < n - 2; i++) {
            int j = 0;
            while (j < n) {
                if (derece[j] == 1) {
                    // j dugumunun komsusunu bul
                    int komsu = -1;
                    while (kenarIndeksi < agac.length) {
                        if (agac[kenarIndeksi][0] == j) {
                            komsu = agac[kenarIndeksi][1];
                            break;
                        } else if (agac[kenarIndeksi][1] == j) {
                            komsu = agac[kenarIndeksi][0];
                            break;
                        }
                        kenarIndeksi++;
                    }

                    pruferKod.add(komsu);
                    derece[komsu]--;
                    derece[j]--;
                    break;
                }
                j++;
            }
        }
        return pruferKod;
    }

    // Prufer kodundan agaci olusturma
    public static int[][] pruferKoddanAgaciOlustur(List<Integer> pruferKod, int m) {
        int n = pruferKod.size() + 2;
        int[][] agac = new int[n - 1][2];
        int[] derece = new int[n];
        for (int dugum : pruferKod) {
            derece[dugum]++;
        }
        for (int i = 0; i < n; i++) {
            derece[i]++;
        }

        int ptr = 0;
        while (ptr < n && derece[ptr] != 1) {
            ptr++;
        }
        int yaprak = ptr;

        for (int i = 0; i < n - 2; i++) {
            int sonrakiDugum = pruferKod.get(i);
            agac[i][0] = yaprak;
            agac[i][1] = sonrakiDugum;

            derece[sonrakiDugum]--;
            if (derece[sonrakiDugum] == 1 && sonrakiDugum < ptr) {
                yaprak = sonrakiDugum;
            } else {
                ptr++;
                while (ptr < n && derece[ptr] != 1) {
                    ptr++;
                }
                yaprak = ptr;
            }
        }

        agac[n - 2][0] = yaprak;
        for (int i = 0; i < n; i++) {
            if (derece[i] == 1) {
                agac[n - 2][1] = i;
                break;
            }
        }
        return agac;
    }

    public static void main(String[] args) {
        System.out.println("Prufer Dizilimi programina hosgeldiniz!");
        System.out.println("Prufer Dizilimi Algoritmasi: bir agacin kenarlarindan olusturulacak bir dizilim algoritmasidir.");
        // Hazir graf (agac)
        int[][] hazirAgac = {
                {1, 2},
                {1, 3},
                {1, 4},
                {2, 5},
                {4, 6}
        };
        int dugumSayisi = 7; // Dugum sayisi (1'den basliyor)

        // Prufer koduna dönusturme
        List<Integer> pruferKod = agaciPruferKodunaDonustur(hazirAgac, dugumSayisi);
        System.out.println("Prufer Kodu: " + pruferKod);

        // Prufer kodundan agaci olusturma
        int[][] yenidenOlusturulanAgac = pruferKoddanAgaciOlustur(pruferKod, pruferKod.size());
        System.out.println("Yeniden olusturulan agac (kenarlar):");
        for (int[] kenar : yenidenOlusturulanAgac) {
            System.out.println(kenar[0] + " - " + kenar[1]);

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