import java.util.Scanner;

import Aletler.GenelGecer;

public class Menu {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int secim;
        
        while (true) {
            
            System.out.println("Ana Menu:");
            System.out.println("Ogrenci numarasi: 202313171037\t Adi Soyadi: Enes Ayhan Benli");
            System.out.println("Derse Kayitli Oldugu Ogretim Grubu (1. Ogretim)");
            System.out.println("1-) Sayi Grubu Algoritmalari");
            System.out.println("2-) Siralama Algoritmalari");
            System.out.println("3-) Arama Algoritmalari");
            System.out.println("0-) Cikis");
            //iki farklı kontrol olmasının sebebi kullanıcının tam sayı girmesinin gerekmesi alt satır onu sağlıyor
            //switchteki kontrol ise girilen sayının istediğimiz tam sayılar arasında olup olmadıgını kontrol ediyor
            secim= Aletler.GenelGecer.tamsayiAl();
            switch (secim) {
                case 0:
                    System.out.println("Programdan cikiliyor...");
                    return;
                case 1:
                    
                    Sayilar.SayiMenusu.main(args);
                    break;
                case 2:
                    
                    Siralamalar.SiralamaMenusu.main(args);
                    break;
                case 3:
                    Aramalar.AramaMenusu.main(args);
                    break;
                
                default:
                    
                    System.out.println("Lutfen 0 ile 3 arasinda bir sayi giriniz.");
            }
        
        }
    }
}