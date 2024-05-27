package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class GnomeSort {
    /*
     * Gnome Sort
     */

    public static void main(String[] args) {
        System.out.println("Gnome Sort  programina hosgeldiniz!");
        System.out.println("Gnome Sort:Yanyana duran ve siralama kriterini bozan bir ikili bulunana kadar dizide hareket ettirilir.");
        System.out.println("Bu ikili bulununca duzeltilir ve dengeye ulasana kadar ornegin dizinin basina kadar geri donulur.");
        System.out.println("Ardindan islemi kaldigi yerden devam eder.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        gnomeSort(dizi, dizi.length);
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
    static void gnomeSort(int arr[], int n) 
    { 
        int index = 0; 
  
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (arr[index] >= arr[index - 1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = arr[index]; 
                arr[index] = arr[index - 1]; 
                arr[index - 1] = temp; 
                index--; 
            } 
        } 
        return; 
    } 


}

