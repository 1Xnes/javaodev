import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int secim;
        boolean devam=true;
        System.out.print("\033\143"); // Ekrani temizle
        while (devam==true) {
            
            System.out.println("Ana Menu:");
            System.out.println("Ogrenci numarasi: 202313171037\t Adi Soyadi: Enes Ayhan Benli");
            System.out.println("Derse Kayitli Oldugu Ogretim Grubu (1. Ogretim)");
            System.out.println("1-) Sayi Grubu Algoritmalari");
            System.out.println("2-) Siralama Algoritmalari");
            System.out.println("3-) Arama Algoritmalari");
            System.out.println("0-) Cikis");
            System.out.print("Seciminizi giriniz: ");
            //iki farklı kontrol olmasının sebebi kullanıcının tam sayı girmesinin gerekmesi alt satır onu sağlıyor
            //switchteki kontrol ise girilen sayının istediğimiz tam sayılar arasında olup olmadıgını kontrol ediyor
            if (!klavye.hasNextInt()) {
                System.out.print("\033\143"); // Ekrani temizle
                System.out.println("Lutfen bir tamsayı giriniz.");
                klavye.nextLine(); // Boş bir satırı atlayarak klavyeden kalan verileri temizle
                continue; // Döngüye gir ve yeni bir giriş bekle
            }


            secim = klavye.nextInt();
            switch (secim) {
                case 0:
                    System.out.println("Programdan cikiliyor...");
                    return;
                case 1:
                    System.out.print("\033\143"); // Ekrani temizle
                    Sayilar.SayiMenusu.main(args);
                    break;
                case 2:
                    System.out.print("\033\143"); // Ekrani temizle
                    Siralamalar.SiralamaMenusu.main(args);
                    break;
                case 3:
                    System.out.print("\033\143"); // Ekrani temizle
                    Aramalar.AramaMenusu.main(args);
                    break;
                
                default:
                    System.out.print("\033\143"); // Ekrani temizle
                    System.out.println("Lutfen 0 ile 3 arasinda bir sayi giriniz.");
            }
            System.out.println();
        }
    }
}