package Sayilar;
import java.util.Scanner;

public class CullenSayilar {
    // n*2n+1 formundaki sayılara cullen sayıları denir 
    public static void main(String[] args) {
        /* Programda cullen sayilarinin formu n*2n+1 olan sayilari listeleyecek ve
         kullanicidan bir sayi alip cullen sayisini bulacagiz
         */
        System.out.println("Cullen sayilar programina hosgeldiniz!");
        System.out.println("Cullen sayilari formu n*2n+1 olan sayilardir");
        System.out.println("Ilk birkac cullen sayisi: 1, 3, 9, 25, 65, 161, 385, 897...");
        System.out.print("Lutfen bir sayi giriniz(n sayisi): ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        /* cullen sayisini bulma islemi */
        int cullenSayisi = sayi*(2*sayi)+1;
        System.out.println(sayi+" için cullen sayisi: "+cullenSayisi);
        int secim= Aletler.GenelGecer.devamEt();
        /* Programdan cikma islemi */
        if (secim == 1) {
            main(args);
        } else {
            System.out.println("Bir ust menuye donulyor...");
        }   
    }

}
