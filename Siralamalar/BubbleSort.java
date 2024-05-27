package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class BubbleSort {
    /*
     * Bubble sort (Kabarcik/Baloncuk Siralama): listedeki her bir eleman yanindaki eleman ile karsilastirilir.
     */

    public static void main(String[] args) {
        System.out.println("Bubble sort programina hosgeldiniz!");
        System.out.println("Bubble sort (Kabarcik/Baloncuk Siralama): listedeki her bir eleman yanindaki eleman ile karsilastirilir.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        bubbleSort(dizi, dizi.length);
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
    
    static void bubbleSort(int dizi[], int n)
    {
        int i, j, gecici;
        boolean yerDegisti;
        for (i = 0; i < n - 1; i++) {
            yerDegisti = false;
            for (j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    
                    // dizi[j] ile dizi[j+1]'in yerini degistir
                    gecici = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = gecici;
                    yerDegisti = true;
                }
            }

            // Yer değişen eleman yoksa liste sıralanmış demektir
            if (yerDegisti == false)
                break;
        }
    }


}
