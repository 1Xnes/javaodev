package Aramalar;

public class Prims {
    /*
     * Prim's Algoritmasi
     */
    private static final int V = 5;
    public static void main(String[] args) {
        System.out.println("Prim's Algoritmasi programina hosgeldiniz!");
        System.out.println("Prim's Algoritmasi: Prims algoritmasi agirlikli ve yonsuz grafda(weighted undirected graph) asgari tarama agacini(minimum spanning tree) bulan bir ac gozlu algoritmadir(greedy algorithm).");
        System.out.println("Bu algoritma da graflar uzerinde calistigi icin hazir graf uzerinden ornek verecegiz. ");
        Prims t = new Prims();
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
									{ 2, 0, 3, 8, 5 },
									{ 0, 3, 0, 0, 7 },
									{ 6, 8, 0, 0, 9 },
									{ 0, 5, 7, 9, 0 } };

		// Çözümü yazdır
		t.primMST(graph);

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    int minKey(int key[], Boolean mstSet[])
	{
		// Min değerini başlat
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < V; v++)
			if (mstSet[v] == false && key[v] < min) {
				min = key[v];
				min_index = v;
			}

		return min_index;
	}

	// Oluşturulan MST'yi yazdırmak için bir yardımcı fonksiyon
	// parent[] içinde saklanır
	void printMST(int parent[], int graph[][])
	{
		System.out.println("Kenar \tAğırlık");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i + "\t"
							+ graph[i][parent[i]]);
	}

	// Komşuluk matrisi gösterimi kullanılarak temsil edilen bir grafik için
	// MST'yi oluşturan ve yazdıran fonksiyon
	void primMST(int graph[][])
	{
		// Oluşturulan MST'yi saklamak için dizi
		int parent[] = new int[V];

		// Kesimde minimum ağırlık kenarını seçmek için kullanılan anahtar değerler
		int key[] = new int[V];

		// MST'ye dahil edilen düğümler kümesini temsil etmek için
		Boolean mstSet[] = new Boolean[V];

		// Tüm anahtarları INFINITE olarak başlat
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		// Her zaman ilk 1. düğümü MST'ye dahil edin.
		// Bu düğümün ilk düğüm olarak seçilmesi için
		// anahtarı 0 yapın
		key[0] = 0;
	
		// İlk düğüm her zaman MST'nin köküdür
		parent[0] = -1;

		// MST, V düğüme sahip olacaktır
		for (int count = 0; count < V - 1; count++) {
			
			// Henüz MST'ye dahil edilmemiş düğümler kümesinden
			// minimum anahtar değerine sahip düğümü seçin
			int u = minKey(key, mstSet);

			// Seçilen düğümü MST Kümesine ekleyin
			mstSet[u] = true;

			// Seçilen düğümün komşu düğümlerinin anahtar değerini ve
			// üst dizinini güncelleyin.
			// Yalnızca henüz MST'ye dahil edilmemiş düğümleri dikkate alın
			for (int v = 0; v < V; v++)

				// graph[u][v], yalnızca komşu düğümler için sıfırdan farklıdır
				// m mstSet[v], henüz MST'ye dahil edilmemiş düğümler için false'tur
				// Anahtarı yalnızca graph[u][v], key[v]'den küçükse güncelleyin
				if (graph[u][v] != 0 && mstSet[v] == false
					&& graph[u][v] < key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}
		}

		// Oluşturulan MST'yi yazdır
		printMST(parent, graph);
	}

}
