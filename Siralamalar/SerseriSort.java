package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class SerseriSort {
    /*
     * Stooge Sort
     */

    public static void main(String[] args) {
        System.out.println("Stooge Sort programina hosgeldiniz!");
        System.out.println("Stooge Sort(Serseri Siralama) : recursive bir algoritmadir. birkac asamadan olusur");
        System.out.println("1-) Ilk ve son elemanlar karsilastirilir ve son eleman ilk elemandan buyukse yer degistirilir.");
        System.out.println("2-) Elemanlarin ilk 2/3'unu  ozyinelemeli olarak siralayin");
        System.out.println("3-) Elemanlarin son 2/3'unu  ozyinelemeli olarak siralayin");
        System.out.println("4-) Nihai verilerin siralandigini dogrulamak icin ogelerin ilk 2/3'unu tekrar siralayin.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        stoogesort(dizi, 0, dizi.length-1);
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
    private static void stoogesort(int arr[], int l, int h) 
    { 
    if (l >= h) 
        return; 

    // Eger ilk eleman, son elemandan kucukse, onlari degistir
    if (arr[l] > arr[h]) { 
        int t = arr[l]; 
        arr[l] = arr[h]; 
        arr[h] = t; 
    } 

    // Eger dizide 2'den fazla eleman varsa
    if (h - l + 1 > 2) { 
        int t = (h - l + 1) / 3; 

        // İlk 2/3 elemani tekrarlayarak sirala
        stoogesort(arr, l, h - t); 

        // Son 2/3 elemani tekrarlayarak sirala
        stoogesort(arr, l + t, h); 

        // Dogrulamak icin tekrar ilk 2/3 elemani sirala
        stoogesort(arr, l, h - t); 
        } 
    } 
    


}

