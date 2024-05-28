package Aramalar;
import java.util.Scanner;   

public class Kruskal {
    /*
     * Kruskal Algoritmasi
     */

    public static void main(String[] args) {
        System.out.println("Kruskal Algoritmasi  programina hosgeldiniz!");
        System.out.println("Kruskal Algoritmasinda butun yollar listelenip kucukten buyuge dogru siralanir");
        System.out.println("Bu da hazir graf uzerinden deneyecegimiz bir algoritma");
        
        

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
