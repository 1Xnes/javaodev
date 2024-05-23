package Sayilar;
import java.util.Scanner;

public class WeodalSayilar {
    /*
     * Wodal sayilar
     */
    
    public static void main(String[] args) {
        System.out.println("Weodall sayilar programina hosgeldiniz!");
        System.out.println("Weodall sayilar (n*(2^n))-1 formundaki sayılara denir.");
        System.out.println("Ornegin n=2 icin: 2*(2^2)-1 = 7");
        System.out.print("n'i giriniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        int wodalSayi = weodallAl(sayi);
        System.out.println("Sonuc: ");
        System.out.println("(" + sayi + "*(2^" + sayi + "))-1= " + wodalSayi);

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }

    }

    private static int weodallAl(int sayi) {
        return (int) ((sayi * Math.pow(2, sayi)  ) - 1);
    }

}
