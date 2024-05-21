package Sayilar;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatSayilar {
    /**
     * Fermat sayilar, n sifirdan kucuk olmayan bir tam sayi olmak üzere,
     * F(n)=2^(2^(n))+1
     */
    public static void main(String[] args) {
        System.out.println("Fermat sayilar programina hosgeldiniz!");
        System.out.println("Fermat sayilar, n sifirdan kucuk olmayan bir tam sayi olmak üzere, F(n)=2^(2^(n))+1");
        System.out.println("Ilk birkac fermat sayisi: 3, 5, 17, 257, 65537, 4294967297");
        System.out.print("Kacinci fermat sayisina kadar listeleyelim?\nSayiniz: ");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        // 0'dan sayimizin 1 eksigine kadar(0 ve 1den baslayarak) n. degerleri cevirir.(fermat sayi formulu ile)
        for (int i = 0; i <sayi; i++) {
            BigInteger fermatSayisi = BigInteger.valueOf(2).pow(BigInteger.valueOf(2).pow(i).intValue()).add(BigInteger.ONE);
            System.out.print(fermatSayisi +" ");
        }

        System.out.println();

        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekrani temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
    }
   
}
