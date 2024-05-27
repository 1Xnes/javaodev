package Sayilar;
import java.util.Arrays;
import java.util.Scanner;

public class Alti174Sayilar {
    /*
     adimlari
     
    Tüm rakamları aynı olmayan (2222 gibi) herhangi bir dört basamaklı sayı alınır (sayı 0 ile başlayabilir).
    Sayının rakamları büyükten küçüğe ve küçükten büyüğe sıralanarak iki yeni dört basamaklı sayı elde edilir.
    Büyük sayıdan küçük sayı çıkarılır.
    Bulunan sayı 6174 değilse işlem 2. adımdan itibaren bu yeni sayı ile tekrarlanır.
     */
    
    public static void main(String[] args) {
        System.out.println("6174 Sayilar programina hosgeldiniz!");
        System.out.println("Kaprekar sabiti olarak da bilinen bu sayının özelliği, 4 basamakli sayilar uzerinde belirli adımlar takip edildiğinde en fazla 7 adımda 6174 sayısını elde edilmesidir.");
        System.out.println("Ornegin: 5269 ve 1405 sayilarindadir");
        System.out.print("\n Kontrol edecegimiz Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int[] sonuc = kaprekarAlgoritmasi(sayi);
        System.out.println("6174'e " + (sonuc[1]-1) + " adimda ulasildi.\n");
        
    }
    public static int[] kaprekarAlgoritmasi(int sayi) {
        int adim = 0;

        while (sayi != 6174) {
            // Büyükten küçüğe ve küçükten büyüğe sıralanmış rakamları al
            int artan = haneleriSirala(sayi, true);
            int azalan = haneleriSirala(sayi, false);
            // Farkı hesapla
            sayi = azalan - artan;
            adim++;
            // Her adımda bilgi yazdır
            System.out.println("Adim " + adim + ": " + azalan + " - " + artan + " = " + sayi);
        }

        // Sonuçları döndür
        return new int[] {adim, adim + 1};
    }

    // Rakamları sırala
    public static int haneleriSirala(int sayi, boolean artan) {
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = sayi % 10;
            sayi /= 10;
        }

        if (artan) {
            Arrays.sort(digits);
        } else {
            Arrays.sort(digits);
            donguTersCevir(digits);
        }

        int sonuc = 0;
        for (int digit : digits) {
            sonuc = sonuc * 10 + digit;
        }

        return sonuc;
    }

    // Diziyi tersine çevir
    public static void donguTersCevir(int[] array) {
        int baslangic = 0;
        int son = array.length - 1;

        while (baslangic < son) {
            int temp = array[baslangic];
            array[baslangic] = array[son];
            array[son] = temp;
            baslangic++;
            son--;
        }
    }

}

