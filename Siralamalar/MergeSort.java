package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class MergeSort {
    /*
     * Merge Sort(Birleştirmeli sıralama): diziyi ardışık olarak 
     * en küçük alt dizilerine kadar yarılayan sonra da onları sıraya koyarak bireştiren
     * algoritmadir
     */

    public static void main(String[] args) {
        System.out.println("Merge Sort programina hosgeldiniz!");
        System.out.println("Merge Sort(Birlestirmeli  siralama):en küçük alt dizilerine kadar yarılayan sonra da onları sıraya koyarak bireştiren algoritmadir");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        sirala(dizi, 0, dizi.length - 1);
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

    private static void birlestir(int arr[], int l, int m, int r)
    {
        // birlestirileceklerin boyutlarini bul
        int n1 = m - l + 1;
        int n2 = r - m;

        // geicici listeleri olustur
        int L[] = new int[n1];
        int R[] = new int[n2];

        // verileri L[] ve R[] listelerine doldur
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // gecici listeleri birlestir
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // l'nin kalan elemanları varsa kopyala
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // R'nin kalan elemanları varsa kopyala
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    private static void sirala(int arr[], int l, int r)
    {
        if (l < r) {

            // orta noktayi bul
            int m = l + (r - l) / 2;

            // birinci ve ikincileri sirala
            sirala(arr, l, m);
            sirala(arr, m + 1, r);

            // siralananlari birlestir
            birlestir(arr, l, m, r);
        }
    }
    


}
