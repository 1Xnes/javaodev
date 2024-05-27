package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class LuckySort {
    /*
     * Lucky Sort(Sansli Siralama)
     */

    public static void main(String[] args) {
        System.out.println("Lucky Sort programina hosgeldiniz!");
        System.out.println("Lucky Sort(Sansli Siralama): En iyi sorting algoritmasidir, liste zaten sirali girilir");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        System.out.println("Siralanmis dizi:");
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
    


}
