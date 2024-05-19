package Aramalar;
import java.util.Scanner;
public class AramaMenusu {
    public static void main(String[] args) {
        
        System.out.println("Arama Menusu Acildi!");
        System.out.println("1- Doğrusal Arama (Linear Search)");
        System.out.println("2- İkili arama (binary search)");
        System.out.println("3- Interpolasyon Araması (Ara değer araması, Interpolation Search)");
        System.out.println("4- Şekiller (graflar (Graphs) ) içinde çalışan algoritmalar");
        System.out.println("5- Sabit Maliyetli Arama (Uniform Cost Search)");
        System.out.println("6- Floyd Warshall algoritması");
        System.out.println("7- Prim’s Algoritması");
        System.out.println("8- Kruskal Algoritması");
        System.out.println("9- Dijkstra Algoritması");
        System.out.println("10- Bellman Ford Algoritması");
        System.out.println("11- İkili arama ağacı (Binary Search Tree)");
        System.out.println("12- Prüfer dizilimi");
        System.out.println("13- Metin arama algoritmaları (bir yazı içerisinde belirli bir dizgiyi (string) arayan algoritmalar)");
        System.out.println("14- Horspool Arama Algoritması");
        System.out.println("15- Kaba Kuvvet Metin Arama Algoritması (Brute Force Text Search, Linear Text Search)");
        System.out.println("0- Ana Menuye Don");
        int secim= Aletler.GenelGecer.tamsayiAl();

        switch (secim) {
            case 0:
                
                System.out.println("Bir ust menuye donuluyor...");
                break;
            case 1:
                System.out.println("1- Doğrusal Arama (Linear Search)");
                break;
            case 2:
                System.out.println("2- İkili arama (binary search)");
                break;
            case 3:
                System.out.println("3- Interpolasyon Araması (Ara değer araması, Interpolation Search)");
                break;
            case 4:
                System.out.println("4- Şekiller (graflar (Graphs) ) içinde çalışan algoritmalar");
                break;
            case 5:
                System.out.println("5- Sabit Maliyetli Arama (Uniform Cost Search)");
                break;
            case 6:
                System.out.println("6- Floyd Warshall algoritması");
                break;
            case 7:
                System.out.println("7- Prim’s Algoritması");
                break;
            case 8:
                System.out.println("8- Kruskal Algoritması");
                break;
            case 9:
                System.out.println("9- Dijkstra Algoritması");
                break;
            case 10:
                System.out.println("10- Bellman Ford Algoritması");
                break;
            case 11:
                System.out.println("11- İkili arama ağacı (Binary Search Tree)");
                break;
            case 12:
                System.out.println("12- Prüfer dizilimi");
                break;
            case 13:
                System.out.println("13- Metin arama algoritmaları (bir yazı içerisinde belirli bir dizgiyi (string) arayan algoritmalar)");
                break;
            case 14:
                System.out.println("14- Horspool Arama Algoritması");
                break;
            case 15:
                System.out.println("15- Kaba Kuvvet Metin Arama Algoritması (Brute Force Text Search, Linear Text Search)");
                break;
            default:
                
                System.out.println("Lutfen 1-15 arasinda bir sayi giriniz.");
                AramaMenusu.main(args);
                break;
        }
            

    }
}