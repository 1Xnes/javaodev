package Sayilar;
import java.util.Scanner;

public class ArmstrongSayilar {

    public static void main(String[] args) {

        System.out.println("Armstrong sayilar programina hosgeldiniz!");
        System.out.println("N haneli bir sayinin basamaklarinin n'inci ustlerinin toplami, sayinin kendisine esitse, böyle sayilara Armstrong sayi denir ");
        System.out.println("Ornegin 407 = 4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407 ");
        System.out.println("Kontrol edecegimiz sayiyi giriniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        armstrongMu(sayi);
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            main(args);
        }
        else{
            System.out.println("Bir ust menuye donuluyor...");
        }


    }
   
    private static void armstrongMu(int sayi) {
        int basamakSayisi = (int) Math.floor(Math.log10(sayi)) + 1;
        int toplam = 0;
        int temp = sayi;

        while (temp != 0) {
            int kalan = temp % 10;
            toplam += Math.pow(kalan, basamakSayisi);
            temp = temp / 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir Armstrong sayisi.");
            temp = sayi;
            boolean first = true;
            while (temp != 0) {
                int kalan = temp % 10;
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(kalan + "^" + basamakSayisi);
                first = false;
                temp = temp / 10;
            }
            System.out.println(" = " + toplam);
        } else {
            System.out.println(sayi + " bir Armstrong sayisi degil.");
        }
    }

}
