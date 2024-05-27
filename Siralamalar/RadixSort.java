package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
import java.util.Arrays;

public class RadixSort {
    /*
     * Radix sort sablonu
     */
    public static void main(String[] args) {
        System.out.println("Radix sort programina hosgeldiniz!");
        System.out.println("Radix sort(Taban Siralama): Her basamakta sayilarin kucukten buyuge siralanmasi ile calisir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        radixSort(dizi);
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

    /*
     * Radix sort
     */
    private static void radixSort(int[] arr) {
        // Maksimum sayiyi bul, basamak sayisini bilmek icin
        int m = getMax(arr, arr.length);

        // Her basamak icin counting sort yap. Not edin ki
        // basamak numarasi gecmek yerine, exp gecilir.
        // exp, su anki basamak numarasi icin 10^i' dir
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, arr.length, exp);
    }

    /*
     * Bir yardimci fonksiyon, arr[]'deki maksimum degeri almak icin
     */
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

   /*
     * arr[]'nin sayisal olarak temsil edilen basamagina gore counting sort yapmak icin bir fonksiyon
     */
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // cikti dizisi
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // count[] dizisinde gorunum sayisini sakla
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // count[i]'yi degistir, boylece count[i] su anda bu basamagin cikti[]'deki
        // gercek konumunu icerir
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // cikti dizisini olustur
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // cikti dizisini arr[]'ye kopyalayin, boylece arr[] su anda
        // mevcut basamaga gore sirali sayilari icerir
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

   
}
