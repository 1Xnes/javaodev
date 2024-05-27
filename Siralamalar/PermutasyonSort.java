package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class PermutasyonSort {
    /*
     * Template
     */

    public static void main(String[] args) {
        System.out.println("Permutasyon Sort programina hosgeldiniz!");
        System.out.println("Permutasyon Sort:Basitce bir sayi dizisinin butun permutasyonlari sirasiyla siralanir ve bunlarin birisinin olarak saklandigi yerde ureme sona erer.");
        System.out.println("Siralamak icin dizinizi alalim.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        permSort(dizi, dizi.length);
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
    private static boolean siraliMi(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean permSort(int[] arr, int size) {
        if (size <= 0) {
            return siraliMi(arr);
        }

        boolean success = false;

        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[size - 1];
            arr[size - 1] = arr[i];
            arr[i] = temp;

            success = permSort(arr, size - 1);

            if (success) {
                return true;
            }

            temp = arr[size - 1];
            arr[size - 1] = arr[i];
            arr[i] = temp;
        }

        return false;
    }


}
