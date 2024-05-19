package Aletler;
import java.util.Scanner;

public class DiziAl {
    
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
    
}

