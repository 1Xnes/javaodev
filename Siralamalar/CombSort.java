package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
    public class CombSort {
    /*
     * Comb Sort
     */

    public static void main(String[] args) {
        System.out.println("Comb Sort siralama programina hosgeldiniz!");
        System.out.println("Comb Sort(Tarak Siralama): Bubble Sort’un gelismis seklidir. Bubble Siralama tum bitisik degerleri karsilastirirken, ");
        System.out.println("Comb siralama tum kaplumbaga degerlerini veya listenin sonuna yakin kucuk degerleri kaldirir. ");
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

    private static int sonrakiBosluguAl(int bosluk)
    {
        // Boşluğu küçültme faktörüne göre azalt
        bosluk = (bosluk*10)/13;
        if (bosluk < 1)
            return 1;
        return bosluk;
    }
 
    private static void sirala(int arr[])
    {
        int n = arr.length;
 
     
        int bosluk = n;

        boolean swapped = true;
 
        // boşluk 1den fazlayken veya swapped true olana kadar dongu
        while (bosluk != 1 || swapped == true)
        {
            bosluk = sonrakiBosluguAl(bosluk);
 
         
            swapped = false;
 
            for (int i=0; i<n-bosluk; i++)
            {
                if (arr[i] > arr[i+bosluk])
                {
                    
                    int temp = arr[i];
                    arr[i] = arr[i+bosluk];
                    arr[i+bosluk] = temp;
 
                
                    swapped = true;
                }
            }
        }
    }
 
    
}

