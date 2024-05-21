package Sayilar;
import java.util.Scanner;

public class LasaSayilar {
    /* Lasa sayılar, tersten yazımı da asal olan asal sayılar için kullanılan bir terimdir.  */
    /* Lasa sayıları ingilizcede emirp numbers olarak geker */
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lasa sayilar programina hosgeldiniz!");
        System.out.println("Lasa sayilari tersten yazilimlari da asal olan sayilardir.");
        System.out.println("Ilk birkac lasa sayisi: 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157");
        System.out.print("Kacinci lasa sayisina kadar listeleyelim?\nSayiniz: ");
        int sayi = klavye.nextInt();
        int i=0,j=13; // en kucuk sayi 13 oldugundan
        while(i<sayi){
            if(asalMi(j) && tersVeRakamlariFarkliMi(j)){
                System.out.print(j+" ");
                i++;
            }
            j++;
        }
        System.out.println();
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            main(args);
        } else {
            System.out.println("Bir ust menuye donuluyor...");
        }
        
    }
    private static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi/2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean tersVeRakamlariFarkliMi(int sayi) {
        // sayiyi stringe ceviriz
        String sayiStr = Integer.toString(sayi);
        //sayiyi tersine ceviriz
        String tersSayiStr = new StringBuilder(sayiStr).reverse().toString();
        //ters sayiyi integere ceviriz
        int tersSayi = Integer.parseInt(tersSayiStr);
 
        //rakamların farklı olup olmadığını kontrol etmek için her bir rakamı karşılaştırıyoruz
        for (int i = 0; i < sayiStr.length(); i++) {
            if (sayiStr.charAt(i) != tersSayiStr.charAt(i)) {
                //rakamların farklı olması durumunda, asal sayının kontrol edilmesini istiyoruz
                if(asalMi(tersSayi)){
                    return true;
                }
            }
        }
        
        //eğer döngü tamamlandıysa, rakamlar birbiriyle aynı
        return false;
    }

    
}
