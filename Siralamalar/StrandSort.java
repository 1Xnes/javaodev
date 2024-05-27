package Siralamalar;

import java.util.ArrayList;
import java.util.List;

// dizi alma metodolojisi
//System.out.println("Hadi bir dizi cagiralim!");
//int[] dizi = Aletler.GenelGecer.diziAl();
//Aletler.GenelGecer.diziYazdir(dizi);

public class StrandSort {
    /*
     * Strand Sort(Serseri Siralama)
     */

    public static void main(String[] args) {
        System.out.println("Strand Sort programına hoş geldiniz!");
        System.out.println("Strand Sort(Serseri Sıralama): bir listenin öğelerini artan sıraya göre sıralayan özyinelemeli bir sıralama algoritmasıdır.");
        System.out.println("Sıralamak için dizinizi alalım.");
        int[] dizi = Aletler.GenelGecer.diziAl();
        List<Integer> inputList = new ArrayList<>();
        for (int num : dizi) {
            inputList.add(num);
        }
        List<Integer> result = strandSort(inputList);
        System.out.println("Sıralanmış Dizi:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekranı temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekranı temizle
            System.out.println("Bir üst menüye dönülüyor...");
        }
        
    }
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) { 
        List<Integer> result = new ArrayList<>(); 
        while (!list1.isEmpty() && !list2.isEmpty()) { 
            if (list1.get(0) < list2.get(0)) { 
                result.add(list1.remove(0)); 
            } else { 
                result.add(list2.remove(0)); 
            } 
        } 
        result.addAll(list1); 
        result.addAll(list2); 
        return result; 
    } 
  
    // Özyinelemeli fonksiyon, strand sıralamasını gerçekleştirir
    public static List<Integer> strandSort(List<Integer> inputList) { 
        // Temel durum: Giriş listesi 1 veya daha az öğe içeriyorsa, zaten sıralıdır
        if (inputList.size() <= 1) { 
            return inputList; 
        } 
  
        // İlk öğe ile bir alt liste başlat
        List<Integer> sublist = new ArrayList<>(); 
        sublist.add(inputList.remove(0)); 
  
        int i = 0; 
        while (i < inputList.size()) { 
            // Giriş listesindeki mevcut öğe, alt listenin son öğesinden büyükse, 
            // onu alt liste ekleyin; aksi takdirde, giriş listesindeki bir sonraki öğeye geçin.
            if (inputList.get(i) > sublist.get(sublist.size() - 1)) { 
                sublist.add(inputList.remove(i)); 
            } else { 
                i++; 
            } 
        } 
  
        // Sıralanmış alt liste, mevcut alt listenin sıralı öğelerini içerir
        List<Integer> sortedSublist = new ArrayList<>(sublist); 
  
        // Giriş listesinin kalan kısmını özyinelemeli olarak sırala
        List<Integer> remainingList = strandSort(inputList); 
  
        // Sıralı alt listeyi ve sıralı kalan listeyi birleştir
        return mergeLists(sortedSublist, remainingList); 
    } 
}
