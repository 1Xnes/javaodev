package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class QuickSort {
    /*
     * Quick sort(hizli siralama): Dizide bir pivot eleman seçilir, bu pivot bir nevi referans noktası olarak kabul edilir. 
     * Bu referans noktasının soluna kendinden küçük değerler, sağına ise kendinden büyük değerler getirilir.
     */

    public static void main(String[] args) {
        System.out.println("Quick Sort programina hosgeldiniz!");
        System.out.println("Quick Sort(Hizli Siralama): Dizide bir pivot eleman seçilir, bu pivot bir nevi referans noktası olarak kabul edilir. ");
        System.out.println("Bu referans noktasının soluna kendinden küçuk değerler, sağına ise kendinden büyük değerler getirilir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        quickSort(dizi, 0, dizi.length-1);
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


    static void yerDegis(int[] arr, int i, int j){
    // Dizideki iki elemanin yerini degistiriyor
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }


    static int bolumlendir(int[] arr, int low, int high){
    // Pivot elemanini secme
    int pivot = arr[high];

    // Daha kucuk elemanin indeksi ve pivotun
    // su ana kadar bulunan dogru pozisyonunu belirtir
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {

        // Mevcut eleman pivotdan kucukse
        if (arr[j] < pivot) {

            // Daha kucuk elemanin indeksini artir
            i++;
            yerDegis(arr, i, j);
        }
    }
    yerDegis(arr, i + 1, high);
    return (i + 1);
    }




    private static void quickSort(int[] arr, int low, int high){
    if (low < high) {

        // pi, bolme indeksidir, arr[pi]
        // simdi dogru yerde
        int pi = bolumlendir(arr, low, high);

        // Bolmeden once ve
        // bolmeden sonra elemanlari ayri ayri sirala
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
        }
    }

}
