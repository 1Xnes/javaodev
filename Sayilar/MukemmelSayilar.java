package Sayilar;
import java.util.Scanner;

/*
 Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı, sayının kendisinin iki katına eşittir. Bu tür sayılara “mükemmel sayı” denir. 
 Örneğin 6 sayısını ele alalım: 1, 2, 3 ve 6 bu sayının bölenleridir ve tüm bu bölenlerin toplamı, yani 1+2+3+6, sayının iki katı olan 12'ye eşittir
 */
public class MukemmelSayilar {

    public static void main(String[] args) {
        
        System.out.println("Mukemmel Sayilar programina hosgeldiniz!");
        System.out.println("Mukemmel sayilar pozitif bolenleri toplami kendisinin iki katina esit olan sayilardir. ");
        System.out.println("1- Mukemmel sayilari listeleyen program");
        System.out.println("2- Girilen sayinin mukemmel olup olmadigini bulan program");
        int secim= Aletler.GenelGecer.tamsayiAl();
        switch (secim) {
            case 1:
                MukemmelSayilarListele();
                break;
            case 2:
                MukemmelSayiKontrolu();
                break;
            default:
                
                System.out.println("Hatali giris yaptiniz. Lutfen 1 veya 2 giriniz.");
                main(args);
                break;
        }
        secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            main(args);
        }
        else{
            System.out.println("Ana menuye donuluyor...");
        }
    
    
    
    }

    public static void MukemmelSayilarListele() {
        // kullanicinin girdigi sayiya kadar olan mukemmel sayilari listeleyen program
        System.out.print("Hangi sayiya kadar olan mukemmel sayilari listeleyelim?\n Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
    for (int i = 1; i <= sayi; i++) {
        int toplam = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                toplam += j;
            }
        }
        if (toplam == i) {
            System.out.print(i + " ");
        }
    }
    }

   
    public static void MukemmelSayiKontrolu() {
        // Girilen sayinin mukemmel sayi olup olmadigini kontrol edecek.
        int sayi, toplam = 0;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = klavye.nextInt();
    
        // 1'den sayinin yarisina kadar sayilari kontrol edecek.
        // Cunku sayinin en buyuk boleni maksimum sayinin yarisi olabilir
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
    
        // Girilen sayinin mukemmel sayi olup olmadigini kontrol edilir.
        if (toplam == sayi) {
            System.out.println(sayi + " bir mukemmel sayidir");
        } else {
            System.out.println(sayi + " bir mukemmel sayi degildir");
        }
    }

}
