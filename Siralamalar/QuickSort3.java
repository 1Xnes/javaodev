package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class QuickSort3 {
    /*
     * Quick Sort3(Hizli Siralama 3)
     */
    static int i, j;

    public static void main(String[] args) {
        System.out.println( "Quick Sort3 siralama programina hosgeldiniz!");
        System.out.println( "Quick Sort3: calisma mekanizmasini dutch national flag'den alir");
        System.out.println("quick sortdan farki sadece 3 yollu parcalama yaparak aynı gelenleri de goz onune alir"); 
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        quicksort(dizi, 0, dizi.length-1);
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
    static void partition(int a[], int l, int r)
{
    i = l - 1; j = r;
    int p = l - 1, q = r;
    int v = a[r];
 
    while (true)
    {
        // Soldan, v'den buyuk veya esit olan ilk elemani bul.
        // Bu dongu kesinlikle sonlanacak cunku v son eleman
        while (a[++i] < v)
            ;
 
        // Sagdan, v'den kucuk veya esit olan ilk elemani bul
        while (v < a[--j])
            if (j == l)
                break;
 
        // Eger i ve j kesisirse, isimiz biter
        if (i >= j)
            break;
 
        // Degistir, boylece kucuk olan sola, buyuk olan saga gider
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
 
        // Pivotun tum ayni sol gorunumlerini dizinin basina tasiyin ve p'yi kullanarak sayin
        if (a[i] == v) {
            p++;
            temp = a[i];
            a[i] = a[p];
            a[p] = temp;
        }
 
        // Pivotun tum ayni sag gorunumlerini dizinin sonuna tasiyin ve q'yu kullanarak sayin
        if (a[j] == v) {
            q--;
            temp = a[q];
            a[q] = a[j];
            a[j] = temp;
        }
    }
 
    // Pivot elemanini dogru indeksine tasiyin
    int temp = a[i];
    a[i] = a[r];
    a[r] = temp;
   
    // Tum sol ayni gorunumleri dizinin basindan alarak a[i]'nin yanina tasiyin
    j = i - 1;
    for (int k = l; k < p; k++, j--)
    {
        temp = a[k];
        a[k] = a[j];
        a[j] = temp;
    }
   
    // Tum sag ayni gorunumleri dizinin sonundan alarak a[i]'nin yanina tasiyin
    i = i + 1;
    for (int k = r - 1; k > q; k--, i++)
    {
        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
 
// 3-yollu bolme tabanli hizli siralama
private static void quicksort(int a[], int l, int r)
{
    if (r <= l)
        return;
 
    i = 0; j = 0;
 
    // i ve j'nin referans olarak gecirildigine dikkat edin
    partition(a, l, r);
 
    // Yineleme
    quicksort(a, l, j);
    quicksort(a, i, r);
}
    


}
