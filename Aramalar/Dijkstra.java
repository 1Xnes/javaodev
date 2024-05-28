package Aramalar;

public class Dijkstra {
    /*
     * Dijkstra Algoritması
     */

    // Düğüm sayısı
    static final int DUGUM_SAYISI = 9;

    // En kısa yolu henüz içermeyen düğümler kümesinden
    // minimum mesafe değerine sahip düğümü bulmak için yardımcı fonksiyon
    int enKisaMesafeyiBul(int mesafe[], Boolean sptSet[]) {
        // Min değerini başlat
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int dugum = 0; dugum < DUGUM_SAYISI; dugum++)
            if (sptSet[dugum] == false && mesafe[dugum] <= min) {
                min = mesafe[dugum];
                min_index = dugum;
            }

        return min_index;
    }

    // Oluşturulan mesafe dizisini yazdırmak için yardımcı fonksiyon
    void sonucuYazdir(int mesafe[]) {
        System.out.println("Düğüm \t\t Kaynaktan Uzaklık");
        for (int i = 0; i < DUGUM_SAYISI; i++)
            System.out.println(i + " \t\t " + mesafe[i]);
    }

    // Komşuluk matrisi gösterimi kullanılarak temsil edilen bir graf için
    // Dijkstra'nın tek kaynaklı en kısa yol algoritmasını uygulayan fonksiyon
    void dijkstra(int graf[][], int kaynak) {
        // Çıktı dizisi. mesafe[i], kaynaktan i'ye olan
        // en kısa mesafeyi tutacak
        int mesafe[] = new int[DUGUM_SAYISI];

        // sptSet[i], i düğümü en kısa yol ağacına dahil edilirse veya kaynaktan i'ye
        // olan en kısa mesafe sonuçlandırılırsa true olacak
        Boolean sptSet[] = new Boolean[DUGUM_SAYISI];

        // Tüm mesafeleri INFINITE ve sptSet[]'i false olarak başlat
        for (int i = 0; i < DUGUM_SAYISI; i++) {
            mesafe[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Kaynak düğümün kendisinden uzaklığı her zaman 0'dır
        mesafe[kaynak] = 0;

        // Tüm düğümler için en kısa yolu bul
        for (int sayac = 0; sayac < DUGUM_SAYISI - 1; sayac++) {
            // Henüz işlenmemiş düğümler kümesinden minimum mesafe düğümünü seçin.
            // u, ilk yinelemede her zaman kaynağa eşittir.
            int u = enKisaMesafeyiBul(mesafe, sptSet);

            // Seçilen düğümü işlenmiş olarak işaretle
            sptSet[u] = true;

            // Seçilen düğümün komşu düğümlerinin mesafe değerini güncelle.
            for (int v = 0; v < DUGUM_SAYISI; v++)

                // mesafe[v]'yi yalnızca sptSet'te değilse, u'dan v'ye bir kenar varsa
                // ve kaynaktan u'ya olan yolun toplam ağırlığı + u'dan v'ye olan
                // ağırlık, mesafe[v]'nin geçerli değerinden küçükse güncelle
                if (!sptSet[v] && graf[u][v] != 0
                    && mesafe[u] != Integer.MAX_VALUE
                    && mesafe[u] + graf[u][v] < mesafe[v])
                    mesafe[v] = mesafe[u] + graf[u][v];
        }

        // Oluşturulan mesafe dizisini yazdır
        sonucuYazdir(mesafe);
    }

    public static void main(String[] args) {
        System.out.println("Dijkstra Algoritmasi  programina hosgeldiniz!");
        System.out.println("Dijkstra algoritmasi, bir baslangic dugumunden diger tum dugumlere olan en kisa yol mesafelerini bulmak icin kullanilir.  ");
        System.out.println("Bu da hazir graf uzerinden deneyecegimiz bir algoritma");

        /* Yukarıda tartışılan örnek grafiği oluşturalım
         */
        int graf[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                    { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                    { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                    { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                    { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(graf, 0);

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekranı temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekranı temizle
            System.out.println("Bir ust menuye dönuluyor...");
        }
    }
}