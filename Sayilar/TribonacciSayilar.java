package Sayilar;

import java.util.Scanner;

public class TribonacciSayilar {

    public static void main(String[] args) {
        System.out.println("Tribonacci sayilar programina hosgeldiniz.");
        System.out.println("Tribonacci sayilari sonraki sayinin onceki 3 sayinin toplamina esit olarak giden sayilar dizisidir.");
        System.out.println("Ornek olarak: 0 0 1 1 2 4 7 13 24");
        tribonacciSayilarListele();
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            main(args);
        } else {
            System.out.println("Bir ust menuye donuluyor...");
        }

    }

    public static void tribonacciSayilarListele() {
        System.out.print("Hangi sayiya kadar olan tribonacci sayilari listeleyelim?\n Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int[] tribonacciSayilar = new int[sayi];
        tribonacciSayilar[0] = 0;
        tribonacciSayilar[1] = 0;
        tribonacciSayilar[2] = 1;
        for (int i = 3; i < sayi; i++) {
            tribonacciSayilar[i] = tribonacciSayilar[i - 1] + tribonacciSayilar[i - 2] + tribonacciSayilar[i - 3];
        }
        for (int i = 0; i < sayi; i++) {
            System.out.print(tribonacciSayilar[i] + " ");
        }
    }
}
