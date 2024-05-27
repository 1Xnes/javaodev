package Siralamalar;
import java.util.*;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class RandomSort{
    /*
     * Random Sort
     */
    static int sayac=0;
    public static void main(String[] args) {
        sayac=0;
        System.out.println("Random Sort programina hosgeldiniz!");
        System.out.println("Random(Rastgele) Sort: Listenin her seferinde shuffle edilmesiyle siralanmaya calisilmasidir");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        sirala(dizi);
        System.out.println("Siralanmis dizi: ");
        Aletler.GenelGecer.diziYazdir(dizi);
        System.out.println("Diziniz: " + sayac + " denemede siralandi");
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
    private static void sirala(int arr[]) {
        Random rand = new Random();
        boolean sorted = false;

        while (!sorted) {
            // Shuffle et
            for (int i = 0; i < arr.length; i++) {
                int index = rand.nextInt(arr.length);
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

            // Sirali mi diye bak
            sorted = siralanmisMi(arr);
            sayac++;
        }
    }

    private static boolean siralanmisMi(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    


}
