import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int secim;

        while (true) {
            System.out.println("Ana Menu:");
            System.out.println("Ogrenci numarasi: 202313171037\t Adi Soyadi: Enes Ayhan Benli");
            System.out.println("Derse Kayitli Oldugu Ogretim Grubu (1.Öğretim)");
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
                case 1:
                    sayiGrubu1();
                    break;
                case 2:
                    sayiGrubu2();
                    break;
                case 3:
                    sayiGrubu3();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
            }
        }
    }

    private static void sayiGrubu1() {
        // Sayı Grubu 1 için işlemleri buraya ekleyin
    }

    private static void sayiGrubu2() {
        // Sayı Grubu 2 için işlemleri buraya ekleyin
    }

    private static void sayiGrubu3() {
        // Sayı Grubu 3 için işlemleri buraya ekleyin
    }
}