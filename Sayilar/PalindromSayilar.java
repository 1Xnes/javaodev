package Sayilar;
import java.util.Scanner;
public class PalindromSayilar {
    

    public static void main(String[] args) {
        System.out.println("Palindrom Sayilar programina hosgeldiniz!");
        System.out.println("Palindrom sayilar tersten ve duzden okunuslari ayni olan sayilardir.");
        palindromSayiKontrolu();
         
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            main(args);
        }
        else{
            System.out.println("Ana menuye donuluyor...");
        }
        
    }
    public static void palindromSayiKontrolu() {
        // Girilen sayinin palindrom sayi olup olmadigini kontrol eder.
        // Ben string methodlarini kullanarak yaptim cunku daha kolaydi.
        int sayi, toplam = 0;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = klavye.nextInt();

        // Girilen sayinin rakamlarini sayacagiz.
        int temp = sayi;
        while (temp != 0) {
            int rakam = temp % 10;
            toplam += rakam;
            temp /= 10;
        }

        // Girilen sayiyi stringe ceviyoruz.
        String tempStr = String.valueOf(sayi);
        
        // Stringi tersine ceviririz.
        String reverseStr = new StringBuilder(tempStr).reverse().toString();

        // Girilen sayinin palindrom sayi olup olmadigini kontrol eder.
        if (tempStr.equals(reverseStr)) {
            System.out.println(sayi + " bir palindrom sayidir");
        } 
        else {
            System.out.println(sayi + " bir palindrom sayi degildir");
        }
    }

    
}
