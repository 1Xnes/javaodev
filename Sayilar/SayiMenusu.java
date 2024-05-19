package Sayilar;
import java.util.Scanner;


public class SayiMenusu {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("\033\143"); // Ekrani temizle
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

        System.out.print("Seciminizi giriniz: ");
        int secim;
        do {
            System.out.print("Seciminizi giriniz: ");
            if (!klavye.hasNextInt()) {
                System.out.println("Lutfen bir tamsayi giriniz.");
                klavye.nextLine(); // Boş bir satiri atlayarak klavyeden kalan verileri temizle
            } else {
                secim = klavye.nextInt();
                break;
            }
        } while (true);

        switch (secim) {
            case 0:
                System.out.print("\033\143"); // Ekrani temizle
                System.out.println("Bir ust menuye donuluyor...");
                break;
            case 1:
                // Mukemmel Sayilar
                // ...
                break;
            case 2:
                // Fibonacci Sayilari (a) Recursive olarak b) standart caliştirma
                // ...
                break;
            case 3:
                // Armstrong sayisi
                // ...
                break;
            case 4:
                // Tribonacci Sayilar
                // ...
                break;
            case 5:
                // Palindrom Sayilar
                // ...
                break;
            case 6:
                // Cullen Sayilari
                // ...
                break;
            case 7:
                // Lasa Sayisi
                // ...
                break;
            case 8:
                // Fermat sayilari
                // ...
                break;
            case 9:
                // Dost Sayilar
                // ...
                break;
            case 10:
                // Zengin Sayilar
                // ...
                break;
            case 11:
                // Lucas Serisi
                // ...
                break;
            case 12:
                // Tetranacci Sayilar
                // ...
                break;
            case 13:
                // Ikiz Sayilar
                // ...
                break;
            case 14:
                // Weodal Sayilar
                // ...
                break;
            case 15:
                // Mersanne Sayilar
                // ...
                break;
            case 16:
                // Harshad Sayilar
                // ...
                break;
            case 17:
                // Cyclic (Döngusel Sayilar)
                // ...
                break;
            case 18:
                // Tav Sayilar
                // ...
                break;
            case 19:
                // Bagdaşik Sayilar (Amicable)
                // ...
                break;
            case 20:
                // 6174 sayisi
                // ...
                break;
            default:
                System.out.println("Lutfen 0 ile 20 arasinda bir sayi giriniz.");
                SayiMenusu.main(args);
                break;
            }
    }
}
