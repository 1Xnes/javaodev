package Sayilar;

import java.util.Scanner;

public class MersanneSayilar {

    public static void main(String[] args) {
        System.out.println("Mersanne sayilar programina hosgeldiniz!");
        System.out.println("Mersanne sayilar ikinin kuvvetlerinin bir eksiği olarak tanimlanir, formulu (2^n)-1'dir");
        System.out.println("Ornegin n=2 icin: 2^2 -1 = 4-1 = 3");
        System.out.print("n'i giriniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int sonuc = (int)Math.pow(2, sayi)-1;
        System.out.println("Sonuc:");
        System.out.println("(2^"+sayi+")-1=" + sonuc);

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
