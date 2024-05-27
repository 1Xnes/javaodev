package Siralamalar;

public class InsertionSort {
    
    public static void main(String[] args) {
        System.out.println("Insertion sort programina hosgeldiniz!");
        System.out.print("Insertion Sort (Eklemeli Siralama):");
        System.out.print("Insertion Sort yani araya ekleme siralama algoritmasi ikinci elemandan baslayarak"); 
        System.out.println("elemanin kendinden önceki elemanlarla karsilastirilmasi ile calisir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        sirala(dizi);
        System.out.print("Siralanmis dizi: ");
        Aletler.GenelGecer.diziYazdir(dizi);
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
    private static void sirala(int dizi[])
    {
        //dizi uzunlugu al
        int n = dizi.length;
        //sirayla karsilastirma
        for (int i = 1; i < n; ++i) {
            int anahtar = dizi[i];
            int j = i - 1;

            /* dizi[0..i-1]'in anahtardan büyük olan öğelerini mevcut konumlarinin bir ilerisine tasir */
            while (j >= 0 && dizi[j] > anahtar) {
                dizi[j + 1] = dizi[j];
                j = j - 1;
            }
            dizi[j + 1] = anahtar;
        }
    }
}
