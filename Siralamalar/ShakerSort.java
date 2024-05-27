package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class ShakerSort {
    /*
     * Shaker Sort (Sallama Siralama):
     */

    public static void main(String[] args) {
        System.out.println("Shaker Sort siralama programina hosgeldiniz!");
        System.out.println("Shaker Sort (Sallama Siralama): iki asamali bir bir yone bir diger yone bakan bir algoritmadir ");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        cocktailSort(dizi);
        System.out.println("Siralanmis dizi: ");
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
    private static void cocktailSort(int a[]){
    boolean degismisMi = true;
    int start = 0;
    int end = a.length;
 
    while (degismisMi == true) 
    {
        // donguye girerken degismisMi bayragini sifirla,
        // cunku onceki yinelemeden true olabilir.
        degismisMi = false;
 
        // bubble sort ile ayni sekilde
        // asagidan yukariya dogru dongu
        for (int i = start; i < end - 1; ++i) 
        {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                degismisMi = true;
            }
        }
 
        // eger hicbir sey hareket etmediyse, dizi siralanmistir.
        if (degismisMi == false)
            break;
 
        // aksi takdirde, degismisMi bayragini sifirla, 
        // boylece bir sonraki asamada kullanilabilir
        degismisMi = false;
 
        // bitis noktasini bir geri tasiyin, 
        // cunku sondaki eleman dogru yerindedir
        end = end - 1;
 
        // yukaridan asagiya dogru,
        // onceki asamadaki ayni karsilastirmalari yapin
        for (int i = end - 1; i >= start; i--) {
            if (a[i] > a[i + 1]) 
            {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                degismisMi = true;
            }
        }
 
        // baslangic noktasini arttirin,
        // cunku son asama bir sonraki
        // en kucuk sayiyi dogru yerine tasimis olur.
        start = start + 1;
        }
    }

    


}
