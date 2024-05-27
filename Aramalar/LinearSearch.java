package Aramalar;
import java.util.Scanner;

public class LinearSearch {
    /*
     * Linear Search
     */

    public static void main(String[] args) {
        System.out.println("Linear Search  programina hosgeldiniz!");
        System.out.println("Linear Search : Lineer arama adindan da anlasilacagi uzere tek tek sirayla deneyerek lineer calisan arama algoritmasidir");
        System.out.println("Oncelikle dizimizi alalim...");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.print("Simdi de hangi elemani arayalim giriniz:");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int sonuc= search(dizi, dizi.length, sayi);
        if (sonuc == -1){
            System.out.print("Eleman dizide yok\n");
        }else{
            System.out.print("Eleman " + sonuc + ". indekste bulundu");
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
    private static int search(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
