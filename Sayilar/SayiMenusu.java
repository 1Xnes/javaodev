package Sayilar;
import java.util.Scanner;


public class SayiMenusu {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Sayi Menusu Acildi!");
        System.out.println("Calistirmak istediginiz sayi grubunu seciniz.");
        System.out.println("1 - Mukemmel Sayilar");
        System.out.println("2 - Fibonacci Sayilari");
        System.out.println("3 - Armstrong sayisi");
        System.out.println("4 - Tribonacci Sayilar");
        System.out.println("5 - Palindrom Sayilar");
        System.out.println("6 - Cullen Sayilari");
        System.out.println("7 - Lasa Sayisi");
        System.out.println("8 - Fermat sayilari");
        System.out.println("9 - Dost Sayilar");
        System.out.println("10 - Zengin Sayilar");
        System.out.println("11 - Lucas Serisi");
        System.out.println("12 - Tetranacci Sayilar");
        System.out.println("13 - Ikiz Sayilar");
        System.out.println("14 - Weodal Sayilar");
        System.out.println("15 - Mersanne Sayilar");
        System.out.println("16 - Harshad Sayilar");
        System.out.println("17 - Cyclic (Döngusel Sayilar)");
        System.out.println("18 - Tam Sayilar");
        System.out.println("19 - Bagdaşik Sayilar (Amicable)");
        System.out.println("20 - 6174 sayisi");
        System.out.println("0 - Onceki menuye don");
        int secim= Aletler.GenelGecer.tamsayiAl();

        switch (secim) {
            case 0:
                
                System.out.println("Bir ust menuye donuluyor...");
                break;
            case 1:
                MukemmelSayilar.main(args);
                break;
            case 2:
                FibonacciSayilar.main(args);
                break;
            case 3:
                ArmstrongSayilar.main(args);
                break;
            case 4:
                TribonacciSayilar.main(args);
                break;
            case 5:
                PalindromSayilar.main(args);
                break;
            case 6:
                CullenSayilar.main(args);
                break;
            case 7:
                LasaSayilar.main(args);
                break;
            case 8:
                FermatSayilar.main(args);
                break;
            case 9:
                DostSayilar.main(args);
                break;
            case 10:
                ZenginSayilar.main(args);
                break;
            case 11:
                LucasSayilari.main(args);
                break;
            case 12:
                TetranacciSayilar.main(args);
                break;
            case 13:
                IkizSayilar.main(args);
                break;
            case 14:
                WeodalSayilar.main(args);
                break;
            case 15:
                MersanneSayilar.main(args);
                break;
            case 16:
                HarshadSayilar.main(args);
                break;
            case 17:
                DonguselSayilar.main(args);
                break;
            case 18:
                TauSayilar.main(args);
                break;
            case 19:
                BagdasikSayilar.main(args);
                break;
            case 20:
                Alti174Sayilar.main(args);
                break;
            default:
                
                System.out.println("Lutfen 0 ile 20 arasinda bir sayi giriniz.");
                SayiMenusu.main(args);
                break;
            }
            if(secim!=0){
            main(args);
            }
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Ana menuye donuluyor...");
    }
}
