package Aramalar;
import java.util.Scanner;

public class AramalarTemplate {
    /*
     * Template
     */

    public static void main(String[] args) {
        System.out.println("Template  programina hosgeldiniz!");
        System.out.println("template :");
        System.out.println("Oncelikle dizimizi alalim...");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.println("Simdi de hangi elemani arayalim giriniz:");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }


}
