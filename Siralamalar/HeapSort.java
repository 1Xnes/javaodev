package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class HeapSort {
    /*
     * HeapSort(Yiginlama)
     */

    public static void main(String[] args) {
        System.out.println("Heap Sort siralama programina hosgeldiniz!");
        System.out.println("Heap Sort(Yiginlama) siralama: Ustteki bireylere parent (ata), alttaki bireylere child(cocuk) denir.");
        System.out.println("Min heap algoritmasinda ata birey en kucuk sayidir.");
        System.out.println("Ata bireyden cocuklar turer ve agac seklinde asagiya dogru devam eder.");
        System.out.println("Bireyler asagiya dogru soldan saga numaralandirilir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        sirala(dizi);
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

    private static void sirala(int arr[])
    {
    int N = arr.length;

    // Yigin yapisi kur (diziyi yeniden duzenle)
    for (int i = N / 2 - 1; i >= 0; i--)
        yiginla(arr, N, i);

    // Elemanlari birer birer yigindan cikar
    for (int i = N - 1; i > 0; i--) {
        // Mevcut kok elemani sona tasir
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Azaltılmış yigin uzerinde max yiginla cagirin
        yiginla(arr, i, 0);
        }
    }

// i dugumu ile koklenen bir alt agaci yiginla etmek icin
// arr[] dizisinde bir indekstir. n yiginin boyutudur
    private static void yiginla(int arr[], int N, int i)
    {
    int enBuyuk = i; // Koku en buyuk olarak baslat
    int l = 2 * i + 1; // sol = 2*i + 1
    int r = 2 * i + 2; // sag = 2*i + 2

    // Eger sol cocuk kokten buyukse
    if (l < N && arr[l] > arr[enBuyuk])
        enBuyuk = l;

    // Eger sag cocuk su ana kadar en buyuk olandan buyukse
    if (r < N && arr[r] > arr[enBuyuk])
        enBuyuk = r;

    // Eger en buyuk kok degilse
    if (enBuyuk != i) {
        int swap = arr[i];
        arr[i] = arr[enBuyuk];
        arr[enBuyuk] = swap;

        // Etkilenen alt agaci yinelemeli olarak yiginla yap
        yiginla(arr, N, enBuyuk);
    }
}

    
    


}
