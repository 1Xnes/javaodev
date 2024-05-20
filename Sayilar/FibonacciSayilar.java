package Sayilar;
import java.util.Scanner;
public class FibonacciSayilar {

    public static void main(String[] args) {
        System.out.println("Fibonacci sayilar programina hosgeldiniz.");
        System.out.println("Fibonacci sayilari sonraki sayinin onceki 2 sayinin toplamina esit olarak giden sayilar dizisidir.");
        System.out.println("Ornek olarak: 0 1 1 2 3...");
        System.out.println("1 - Fibonacci sayilarinin normal yolla yazilisi");
        System.out.println("2 - Fibonacci sayilarinin recursive yolla yazilisi");
        int secim = Aletler.GenelGecer.tamsayiAl();
        switch (secim) {
            case 1:
                FibonacciSayilarListele();
                break;
            case 2:
                FibonacciSayilarListeleRecursive();
                break;
            default:
                System.out.println("Hatali giris yaptiniz. Lutfen 1 veya 2 giriniz.");
                FibonacciSayilar.main(args);
                break;
        }
        secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            FibonacciSayilar.main(args);
        } else {
            System.out.println("Ana menuye donuluyor...");
        }

        
    }
    public static void FibonacciSayilarListele() {
        /*Kullanicidan alinan  n. fibonacci sayisina kadar yazdiran program */
        System.out.print("Kacinci fibonacci sayisina kadar listeleyelim?\n Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;
        System.out.print(sayi1 + " " + sayi2 + " ");
        for (int i = 2; i < sayi; i++) {
            sayi3 = sayi1 + sayi2;
            System.out.print(sayi3 + " ");
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
    }

    public static void FibonacciSayilarListeleRecursive() {
        /*Kullanicidan alinan n. fibonacci sayisini recursive olarak donduren program */
        System.out.print("Kacinci fibonacci sayisina kadar listeleyelim?\n Sayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        for (int i = 0; i < sayi; i++) { // 0'dan sayimizin 1 eksigine kadar(0 ve 1den baslayarak) n. degerleri cevirir.
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
    public static int fibonacciRecursive(int n) {
        
        if (n <= 1) { // 1 ve 0 oldugunda kendilerini dondurur.
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // diger sayilarda ise onceki 2 sayinin toplamini dondurur.
        }
    }
    

}
