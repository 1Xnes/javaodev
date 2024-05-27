package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class FlashSort {
    /*
     * Flash Sort
     */

    public static void main(String[] args) {
        System.out.println("Flash Sort  programina hosgeldiniz!");
        System.out.println("Flash Sort(Simsek Siralama): Flash sort algoritmasi, siralama islemi icin iki adet yardimci diziyi kullanir. Bu dizilerden biri, her elemanin sayisini tutar ve digeri ise her elemanin siralanmis dizideki yeri hakkinda bilgi verir. ");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        flashSort(dizi);
        System.out.println("Siralanmis dizi: ");
        Aletler.GenelGecer.diziYazdir(dizi);
        System.out.println();
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    public static void flashSort(int[] arr) {
        int n = arr.length;
        int m = (int) (0.45 * n);
        int[] l = new int[m];
    
        int min = arr[0];
        int max = arr[0];
    
        // Min ve max değerlerini bul
        for (int i = 1; i < n; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    
        if (min == max) {
            return; // Zaten sıralanmış
        }
    
        double c1 = (m - 1.0) / (max - min);
    
        // Öğeleri sınıflara dağıt
        for (int j = 0; j < n; ++j) {
            int k = (int) (c1 * (arr[j] - min));
            ++l[k];
        }
    
        // Sınıf sınırlarını güncelle
        for (int p = 1; p < m; ++p) {
            l[p] += l[p - 1];
        }
    
        // Permütasyon adımı
        int move = 0;
        int j = 0;
        int k = m - 1;
        while (move < n - 1) {
            while (j > l[k] - 1) {
                ++j;
                k = (int) (c1 * (arr[j] - min));
            }
            int flash = arr[j];
            while (j != l[k]) {
                k = (int) (c1 * (flash - min));
                int t = --l[k];
                int hold = arr[t];
                arr[t] = flash;
                flash = hold;
                ++move;
            }
        }
    
        // Kalan öğeler için doğrudan ekleme
        for (j = 1; j < n; j++) {
            int hold = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > hold) {
                arr[i + 1] = arr[i--];
            }
            arr[i + 1] = hold;
        }
    }
    


}
