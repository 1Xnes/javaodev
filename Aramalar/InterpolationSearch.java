package Aramalar;
import java.util.Scanner;

public class InterpolationSearch {
    /*
     * Interpolation Search
     */

    public static void main(String[] args) {
        System.out.println("Interpolation Search  programina hosgeldiniz!");
        System.out.println("Interpolation Search(Ara deger aramasi): Temelde Binary Search'e benzer");
        System.out.println("Farklari ise binary search’ te her adimda gidilen ortanca index bir formul yardimiyla belirlenir."); 
        System.out.println("Bu islemle daha az adimda aranan degeri bulmak hedeflenir.");
        System.out.println("Oncelikle dizimizi alalim(Sirali bir dizi giriniz)...");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.print("Simdi de hangi elemani arayalim giriniz:");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int sonuc= interpolationSearch(dizi, 0, dizi.length - 1, sayi);
        if (sonuc == -1) {
            System.out.println("Eleman dizide yok!");
        } else {
            System.out.println("Eleman " + sonuc + ". indekste bulundu!");
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
    public static int interpolationSearch(int arr[], int lo,
                                          int hi, int x)
    {
        int pos;
 
        // Since array is sorted, an element
        // present in array must be in range
        // defined by corner
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
 
            // Probing the position with keeping
            // uniform distribution in mind.
            pos = lo
                  + (((hi - lo) / (arr[hi] - arr[lo]))
                     * (x - arr[lo]));
 
            // Condition of target found
            if (arr[pos] == x)
                return pos;
 
            // If x is larger, x is in right sub array
            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi,
                                           x);
 
            // If x is smaller, x is in left sub array
            if (arr[pos] > x)
                return interpolationSearch(arr, lo, pos - 1,
                                           x);
        }
        return -1;
    }

}
