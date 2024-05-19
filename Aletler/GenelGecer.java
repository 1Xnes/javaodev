package Aletler;
import java.util.Scanner;

public class GenelGecer {
    public static int[] diziAl() {
        
        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizinin uzunligini giriniz: ");
        int uzunluk = klavye.nextInt();
        int[] dizi = new int[uzunluk];
        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }
        return dizi;
    }
    public static int tamsayiAl() {
        Scanner klavye = new Scanner(System.in);
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
        return secim;
    }
    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
