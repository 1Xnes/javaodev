package Siralamalar;

import java.util.ArrayList;
import java.util.List;

public class KovaSort {
    /*
     * Bucket(Kova) Sort
     */

    public static void main(String[] args) {
        System.out.println("Bucket Sort programina hosgeldiniz!");
        System.out.println("Bucket(Kova) Sort: elemanlari belirli grup veya kovalara bolerek siralayan algoritma");
        System.out.println("Ancak kovalar secilen bir siralama algoritmasiyla yapilir");
        System.out.println("Ornek olarak biz kovalari siralamak icin insertion sort kullanacagiz");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        float[] floatArray = new float[dizi.length];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            floatArray[i] = (float) dizi[i];
            if (dizi[i] > maxValue) {
                maxValue = dizi[i];
            }
        }
        bucketSort(floatArray, maxValue);
        for (int i = 0; i < floatArray.length; i++) {
            dizi[i] = (int) floatArray[i];
        }
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
    
    private static void insertionSort(List<Float> bucket) {
        for (int i = 1; i < bucket.size(); ++i) {
            float key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    // Function to sort arr[] of size n using bucket sort
    private static void bucketSort(float[] arr, int maxValue) {
        int n = arr.length;

       // 1) n tane bos kova olustur
    List<Float>[] buckets = new ArrayList[n];
    for (int i = 0; i < n; i++) {
        buckets[i] = new ArrayList<>();
    }

    // 2) elemanlari farkli kovalara koy
    for (int i = 0; i < n; i++) {
        int bi = (int) ((n - 1) * arr[i] / maxValue);
        buckets[bi].add(arr[i]);
    }

    // 3) her bir kovayi insertion sort ile sirala
    for (int i = 0; i < n; i++) {
        insertionSort(buckets[i]);
    }

    // 4) tum kovalari birlestir.
    int index = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < buckets[i].size(); j++) {
            arr[index++] = buckets[i].get(j);
        }
        }
    }
}
