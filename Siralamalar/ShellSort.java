package Siralamalar;
// dizi alma metodolojisi
            //System.out.println("Hadi bir dizi cagiralim!");
            //int[] dizi = Aletler.GenelGecer.diziAl();
            //Aletler.GenelGecer.diziYazdir(dizi);
public class ShellSort {
    /*
     * Shell sirala(Kabuk siralama )
     */

    public static void main(String[] args) {
        System.out.println("Shell sirala programina hosgeldiniz!");
        System.out.println("Shell sirala (Kabuk siralama): Dizileri verilen bosluk ile birden fazla dizi olusturarak karsilastirir.");
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
    
    private static int sirala(int dizi[])
    {
        int n = dizi.length;
 
        // Buyuk bir boslukla baslayip  boslugu azaltiyoruz
        for (int bosluk = n/2; bosluk > 0; bosluk /= 2)
        {
            //bosluklu siralayici
            for (int i = bosluk; i < n; i += 1)
            {
                int temp = dizi[i];
                //kaydirmalar
                int j;
                for (j = i; j >= bosluk && dizi[j - bosluk] > temp; j -= bosluk)
                    dizi[j] = dizi[j - bosluk];
                dizi[j] = temp;
            }
        }
        return 0;
    }
 


}
