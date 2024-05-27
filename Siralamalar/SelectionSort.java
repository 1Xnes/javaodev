package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class SelectionSort {
    /*
     * Secmeli siralama
     */

    public static void main(String[] args) {
        System.out.println("Selection sort programina hosgeldiniz!");
        System.out.println("Selection sort (Secmeli Siralama) yani en kucuk elemanin yerine kendi elemaninin yerini degistirerek karsilastirilmasi ile calisir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        sirala(dizi);
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
    private static void sirala(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Siralanmamis dizideki en kucuk elemani bul
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Bulunan eleman ile en kucuk eleman yer degistir
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    


}
