package Siralamalar;
import java.util.Scanner;

public class SiralamaMenusu {
    public static void main(String[] args) {
        
        System.out.println("Siralama Menusu Acildi!");
        System.out.println("1- Insertion Sort (Eklemeli Sıralama )");
        System.out.println("2- Selection Sort (Seçmeli Sıralama)");
        System.out.println("3- Bubble Sort (Kabarcık/Baloncuk sıralama)");
        System.out.println("4- Divide and Conquer Sort (Böl ve Ayıkla Algoritması)");
        System.out.println("5- Shell Sort");
        System.out.println("6- Merge Sort");
        System.out.println("7- Quick Sort");
        System.out.println("8- Quick Sort3");
        System.out.println("9- Heap Sort (Yığınlama)");
        System.out.println("10- Taban Sıralama (Radix)");
        System.out.println("11- Shaker Sort (Sallama sıralama)");
        System.out.println("12- Rastgele sort(Random sort)");
        System.out.println("13- Lucky Sort (Şanslı Sıralama)");
        System.out.println("14- Serseri Sort (Stooge)");
        System.out.println("15- Şimşek (Flash Sort)");
        System.out.println("16- Comb Sort (Tarak sort)");
        System.out.println("17- Gnome Sort");
        System.out.println("18- Permütasyon Sort");
        System.out.println("19- Strand Sort");
        System.out.println("20- Kova Sort");
        System.out.println("0- Ana Menuye Don");
        int secim= Aletler.GenelGecer.tamsayiAl();

        switch (secim) {
            case 0:
                
                System.out.println("Bir ust menuye donuluyor...");
                break;
            case 1:
                //InsertionSort.main(args);
                System.out.println("Insertion Sort");
                break;
            case 2:
                //SelectionSort.main(args);
                break;
            case 3:
                //BubbleSort.main(args);
                break;
            case 4:
                //DivideAndConquerSort.main(args);
                break;
            case 5:
                //ShellSort.main(args);
                break;
            case 6:
                //MergeSort.main(args);
                break;
            case 7:
                //QuickSort.main(args);
                break;
            case 8:
                //QuickSort3.main(args);
                break;
            case 9:
                //HeapSort.main(args);
                break;
            case 10:
                //RadixSort.main(args);
                break;
            case 11:
                //ShakerSort.main(args);
                break;
            case 12:
                //RandomSort.main(args);
                break;
            case 13:
                //LuckySort.main(args);
                break;
            case 14:
                //SerseriSort.main(args);
                break;
            case 15:
                //ShakerSort.main(args);
                break;
            case 16:
                //CombSort.main(args);
                break;
            case 17:
                //GnomeSort.main(args);
                break;
            case 18:
                //PermuationSort.main(args);
                break;
            case 19:
                //StrandSort.main(args);
                break;
            case 20:
                //KovaSort.main(args);
                break;
            default:
                
                System.out.println("Lutfen 0 ile 20 arasinda bir sayi giriniz.");
                SiralamaMenusu.main(args);
                break;
                
        }
    }
}
