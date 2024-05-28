package Aramalar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kruskal {
    /*
     * Kruskal Algoritması
     */

    

    public static void main(String[] args) {
        System.out.println("Kruskal Algoritması programına hoşgeldiniz!");
        System.out.println("Kruskal Algoritmasında bütün yollar listelenip küçükten büyüğe doğru sıralanır");
        System.out.println("Örnek bir graf üzerinden algoritmayı deneyeceğiz.\n");

        // Örnek graf (tepe sayısı = 4)
        int V = 4;
        List<Kenar> grafKenarlari = new ArrayList<>(
                List.of(new Kenar(0, 1, 10), new Kenar(0, 2, 6),
                        new Kenar(0, 3, 5), new Kenar(1, 3, 15),
                        new Kenar(2, 3, 4)));

        // Kruskal algoritmasını çalıştır
        kruskals(V, grafKenarlari);

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekranı temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekranı temizle
            System.out.println("Bir üst menüye dönülüyor...");
        }
    }
    static class Kenar {
        int kaynak, hedef, agirlik;

        public Kenar(int kaynak, int hedef, int agirlik) {
            this.kaynak = kaynak;
            this.hedef = hedef;
            this.agirlik = agirlik;
        }
    }

    static class AltKume {
        int ebeveyn, derece;

        public AltKume(int ebeveyn, int derece) {
            this.ebeveyn = ebeveyn;
            this.derece = derece;
        }
    }

    private static void kruskals(int V, List<Kenar> kenarlar) {
        int j = 0;
        int kenarSayisi = 0;

        AltKume[] altKumeler = new AltKume[V];
        Kenar[] sonuclar = new Kenar[V];

        for (int i = 0; i < V; i++) {
            altKumeler[i] = new AltKume(i, 0);
        }

        kenarlar.sort(Comparator.comparingInt(o -> o.agirlik));

        while (kenarSayisi < V - 1) {
            Kenar sonrakiKenar = kenarlar.get(j);
            int x = kokBul(altKumeler, sonrakiKenar.kaynak);
            int y = kokBul(altKumeler, sonrakiKenar.hedef);

            if (x != y) {
                sonuclar[kenarSayisi] = sonrakiKenar;
                birlestir(altKumeler, x, y);
                kenarSayisi++;
            }

            j++;
        }

        System.out.println("Oluşturulan MST'nin kenarları şunlardır:");
        int minimumMaliyet = 0;
        for (int i = 0; i < kenarSayisi; i++) {
            System.out.println(sonuclar[i].kaynak + " -- "
                    + sonuclar[i].hedef + " == "
                    + sonuclar[i].agirlik);
            minimumMaliyet += sonuclar[i].agirlik;
        }
        System.out.println("MST'nin toplam maliyeti: " + minimumMaliyet);
    }

    private static void birlestir(AltKume[] altKumeler, int x, int y) {
        int kokX = kokBul(altKumeler, x);
        int kokY = kokBul(altKumeler, y);

        if (altKumeler[kokY].derece < altKumeler[kokX].derece) {
            altKumeler[kokY].ebeveyn = kokX;
        } else if (altKumeler[kokX].derece < altKumeler[kokY].derece) {
            altKumeler[kokX].ebeveyn = kokY;
        } else {
            altKumeler[kokY].ebeveyn = kokX;
            altKumeler[kokX].derece++;
        }
    }

    private static int kokBul(AltKume[] altKumeler, int i) {
        if (altKumeler[i].ebeveyn == i)
            return altKumeler[i].ebeveyn;

        altKumeler[i].ebeveyn = kokBul(altKumeler, altKumeler[i].ebeveyn);
        return altKumeler[i].ebeveyn;
    }
}