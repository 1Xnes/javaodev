package Aramalar;

class BellmanFord {
    /*
     * BellmanFord Algoritması
     */

    // Bir sınıfı temsil eden, bağlı, yönlendirilmiş ve ağırlıklı bir graf
    static class Graph {
  
        // Grafikteki ağırlıklı bir kenarı temsil eden bir sınıf
        class Edge {
            int kaynak, hedef, ağırlık;
            Edge() { kaynak = hedef = ağırlık = 0; }
        }

        int V, E;
        Edge kenar[];

        // V tepe noktası ve E kenar ile graf oluşturur
        Graph(int v, int e) {
            V = v;
            E = e;
            kenar = new Edge[e];
            for (int i = 0; i < e; ++i)
                kenar[i] = new Edge();
        }

        // Bellman-Ford algoritmasını kullanarak src'den diğer tüm tepe noktalarına kadar olan en kısa mesafeleri bulan ana fonksiyon.
        // Fonksiyon ayrıca negatif ağırlıklı döngüyü de algılar.
        void BellmanFord(Graph graph, int src) {
            int V = graph.V, E = graph.E;
            int mesafe[] = new int[V];

            // Adım 1: src'den diğer tüm tepe noktalarına olan mesafeleri INFINITE olarak başlat
            for (int i = 0; i < V; ++i)
                mesafe[i] = Integer.MAX_VALUE;
            mesafe[src] = 0;

            // Adım 2: Tüm kenarları |V| - 1 kez rahatlat. src'den herhangi bir tepe noktasına basit bir kısa yol en fazla |V| - 1 kenar içerebilir.
            for (int i = 1; i < V; ++i) {
                for (int j = 0; j < E; ++j) {
                    int u = graph.kenar[j].kaynak;
                    int v = graph.kenar[j].hedef;
                    int ağırlık = graph.kenar[j].ağırlık;
                    if (mesafe[u] != Integer.MAX_VALUE && mesafe[u] + ağırlık < mesafe[v])
                        mesafe[v] = mesafe[u] + ağırlık;
                }
            }

            // Adım 3: Negatif ağırlıklı döngüler olup olmadığını kontrol et. Yukarıdaki adım, graf negatif ağırlıklı döngü içermiyorsa en kısa mesafeleri garanti eder. Daha kısa bir yol elde edersek, bir döngü vardır.
            for (int j = 0; j < E; ++j) {
                int u = graph.kenar[j].kaynak;
                int v = graph.kenar[j].hedef;
                int ağırlık = graph.kenar[j].ağırlık;
                if (mesafe[u] != Integer.MAX_VALUE && mesafe[u] + ağırlık < mesafe[v]) {
                    System.out.println("Graf negatif ağırlıklı döngü içeriyor");
                    return;
                }
            }
            mesafeYazdir(mesafe, V);
        }

        // Çözümü yazdırmak için kullanılan bir yardımcı fonksiyon
        void mesafeYazdir(int mesafe[], int V) {
            System.out.println("Tepe Noktası Kaynaktan Mesafe");
            for (int i = 0; i < V; ++i)
                System.out.println(i + "\t\t" + mesafe[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("BellmanFord Algoritması programına hoşgeldiniz!");
        System.out.println("Bellman Ford Algoritmasının amacı bir şekil üzerindeki, başlangıç düğümünden hedefe giden en kısa yolu bulmaktır. Bu sebeple Shortest path algorithm olarak sınıflandırılır.");
        System.out.println("Bu da hazır graf üzerinden deneyeceğimiz bir algoritma");

        int V = 5; // Grafikteki tepe noktalarının sayısı
        int E = 8; // Grafikteki kenarların sayısı

        Graph graph = new Graph(V, E);

        // Kenarları ekle
        graph.kenar[0].kaynak = 0;
        graph.kenar[0].hedef = 1;
        graph.kenar[0].ağırlık = -1;

        graph.kenar[1].kaynak = 0;
        graph.kenar[1].hedef = 2;
        graph.kenar[1].ağırlık = 4;

        graph.kenar[2].kaynak = 1;
        graph.kenar[2].hedef = 2;
        graph.kenar[2].ağırlık = 3;

        graph.kenar[3].kaynak = 1;
        graph.kenar[3].hedef = 3;
        graph.kenar[3].ağırlık = 2;

        graph.kenar[4].kaynak = 1;
        graph.kenar[4].hedef = 4;
        graph.kenar[4].ağırlık = 2;

        graph.kenar[5].kaynak = 3;
        graph.kenar[5].hedef = 2;
        graph.kenar[5].ağırlık = 5;

        graph.kenar[6].kaynak = 3;
        graph.kenar[6].hedef = 1;
        graph.kenar[6].ağırlık = 1;

        graph.kenar[7].kaynak = 4;
        graph.kenar[7].hedef = 3;
        graph.kenar[7].ağırlık = -3;

        // Fonksiyon çağrısı
        graph.BellmanFord(graph, 0);

        
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