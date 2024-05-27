package Aramalar;
import static java.util.Arrays.binarySearch;

import java.util.Scanner;

public class BinarySearch {
    /*
     * Binary Search
     */

    public static void main(String[] args) {
        System.out.println("Binary Search  programina hosgeldiniz!");
        System.out.println("Binary Search: Sirali bir dizide diziyi sirayla ortalayarak degerine bakarak giden bir arama turudur");
        System.out.println("Oncelikle dizimizi alalim(Sirali bir dizi giriniz)...");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.print("Simdi de hangi elemani arayalim giriniz:");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int sonuc = binarySearch(dizi, sayi);
        if (sonuc == -1) {
            System.out.println("Eleman dizide yok");
        } else {
            System.out.println("Eleman " + sonuc + ". indekste bulundu");
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
    private static int binarySearch(int arr[], int x)
{
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;

        // x'in ortada olduğunu kontrol et
        if (arr[mid] == x)
            return mid;

        // x büyükse, sol yarısını yok say
        if (arr[mid] < x)
            low = mid + 1;

        // x küçükse, sağ yarısını yok say
        else
            high = mid - 1;
    }

    // Eğer buraya kadar geldiysek, eleman yok demektir
    return -1;
}

}
