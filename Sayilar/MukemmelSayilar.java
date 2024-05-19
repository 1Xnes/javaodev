package Sayilar;
import java.util.Scanner;


public class MukemmelSayilar {

    public static void main(String[] args) {
        
        System.out.println("Mukemmel Sayilar programina hosgeldiniz!");
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
                Sayilar.MukemmelSayilar.main(args);
                break;
        }
        
    
    
    
    }

    public static void MukemmelSayilarListele() {
    }

    public static void MukemmelSayiKontrolu() {
        int n,sum=0;
                     Scanner klavye=new Scanner(System.in);            
        System.out.println("Bir sayi giriniz: ");
                   n=klavye.nextInt();
        int i=1;
        while(i<=n/2)
        {
           if(n%i==0)
           {
        sum+=i;
           }
          i++;
        }
    if(sum==n)
    {
    System.out.println(n+" bir mukemmel sayidir");
               } 
    else
    System.out.println(n+" bir mukemmel sayi degildir"); 
    }
}
