package Aramalar;

public class FloydWarshall {
    /*
     * Floyd Warshall   
     */
    final static int INF = 99999, V = 4;
    public static void main(String[] args) {
        System.out.println("Floyd Warshall programina hosgeldiniz!");
        System.out.println("Floyd Warshall: \r\n" + //
                        "kenar agirliklari arti ya da eksi degere sahip (ancak eksi degerli dongusu olmayan) cizgelerde en kisa yollari bulma algoritmasidir. Algoritma uygulandiginda her dugum cifti icin en kisa yol uzunluklarini bulur.\r\n" + //
                        "");
        System.out.println("Bu algoritmamiz da graflarla calistigi icin hazir graf uzerinden ornek verecegiz");
        /* Aşağıdaki ağırlıklı grafiği oluşturalım
           10
        (0)------->(3)
        |         /|\
        5 |          |
        |          | 1
        \|/         |
        (1)------->(2)
           3           */
        int graph[][] = { { 0, 5, INF, 10 },{ INF, 0, 3, INF },{ INF, INF, 0, 1 },{ INF, INF, INF, 0 } };
        FloydWarshall a = new FloydWarshall();

// Fonksiyon çağrısı
        a.floydWarshall(graph);

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    

    void floydWarshall(int dist[][])
    {

        int i, j, k;

        /* Ara düğüm kümesine tüm düğümleri
           birer birer ekle.
          ---> Bir yineleme başlamadan önce,
               {0, 1, 2, .. k-1} kümesindeki
               düğümler yalnızca ara düğümler
               olarak dikkate alındığında
               tüm düğüm çiftleri arasındaki
               en kısa mesafeye sahibiz.
          ----> Bir yineleme bittiğinde,
                k numaralı düğüm ara düğümler
                kümesine eklenir ve küme
                {0, 1, 2, .. k} olur. */
        for (k = 0; k < V; k++) {
            // Kaynak olarak birer birer tüm düğümleri seç
            for (i = 0; i < V; i++) {
                // Yukarıda seçilen kaynak için hedef olarak tüm düğümleri seç
                for (j = 0; j < V; j++) {
                    // Eğer k düğümü i'den j'ye en kısa yol üzerindeyse,
                    // dist[i][j] değerini güncelle
                    if (dist[i][k] + dist[k][j]
                        < dist[i][j])
                        dist[i][j]
                            = dist[i][k] + dist[k][j];
                }
            }
        }

        // En kısa mesafe matrisini yazdır
        printSolution(dist);
    }

    void printSolution(int dist[][])
    {
        System.out.println(
            "Aşağıdaki matris her düğüm çifti arasındaki en kısa "
            + "mesafeleri gösterir");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }


}
