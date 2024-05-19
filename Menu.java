import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int secim;
        boolean devam=true;
        while (devam==true) {
            System.out.print("\033\143"); // Ekrani temizle
            System.out.println("Ana Menu:");
            System.out.println("Ogrenci numarasi: 202313171037\t Adi Soyadi: Enes Ayhan Benli");
            System.out.println("Derse Kayitli Oldugu Ogretim Grubu (1. Ogretim)");
            System.out.println("1-) Sayi Grubu Algoritmalari");
            System.out.println("2-) Siralama Algoritmalari");
            System.out.println("3-) Arama Algoritmalari");
            System.out.println("0-) Cikis");
            System.out.print("Seciminizi giriniz: ");
            if (!klavye.hasNextInt()) {
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
                    Sayilar.SayiMenusu.main(args);
                    break;
                case 2:
                    Siralamalar.SiralamaMenusu.main(args);
                    break;
                case 3:
                    Aramalar.AramaMenusu.main(args);
                    break;
                
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyiniz.");
            }
            System.out.println();
            System.out.println("Devam etmek istiyor musunuz? (Evet=1, Hayir=0)");
            devam = klavye.nextInt() == 1;
            System.out.print("\033\143");
        }
    }
}