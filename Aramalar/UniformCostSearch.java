package Aramalar;
import java.util.*;

public class UniformCostSearch {

    // Graf'ı temsil etmek için kullanılacak liste (her düğüm ve komşuları)
    static List<List<Integer>> graph = new ArrayList<>();
    // Her bir kenarın maliyetini tutacak HashMap
    static HashMap<List<Integer>, Integer> cost = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Uniform Cost Search  programina hosgeldiniz!");
        System.out.println("Uniform Cost Search(Sabit Maliyetli Arama): Agirlikli graflar (Graphs) icinde aranan degeri bulan bir arama turudur.");
        System.out.println("3 Asamadan olusur");
        System.out.println("1-) Kok dugumden basla (root node)");
        System.out.println("2-) En dusuk maliyetli komsuya git");
        System.out.println("3-) Hedefe ulasana kadar 2. adimi tekrarla");
        System.out.println("Algoritmayi hazir bir graf uzerinde deneyelim");

        // Graf'ı başlat
        for (int i = 0; i < 7; i++) {
            graph.add(new ArrayList<>());
        }

        // Kenarları ve maliyetleri ekle
        addEdgesAndCosts();

        // Hedef düğüm
        List<Integer> goal = new ArrayList<>();
        goal.add(6);

        // Uniform Cost Search algoritmasını çalıştır
        List<Integer> answer = uniformCostSearch(goal, 0);

        // Sonucu yazdır
        System.out.println("0'dan 6'ya minimum maliyet = " + answer.get(0));

        // Tekrar çalıştırma veya çıkış seçeneği
        int secim = Aletler.GenelGecer.devamEt();
        if (secim == 1) {
            System.out.print("\033\143"); // Ekranı temizle
            main(args);
        } else {
            System.out.print("\033\143"); // Ekranı temizle
            System.out.println("Bir ust menuye donuluyor...");
        }
    }

    // Graf'a kenarları ve maliyetleri ekleyen metod
    private static void addEdgesAndCosts() {
        graph.get(0).add(1);
        graph.get(0).add(3);
        graph.get(3).add(1);
        graph.get(3).add(6);
        graph.get(3).add(4);
        graph.get(1).add(6);
        graph.get(4).add(2);
        graph.get(4).add(5);
        graph.get(2).add(1);
        graph.get(5).add(2);
        graph.get(5).add(6);
        graph.get(6).add(4);

        cost.put(Arrays.asList(0, 1), 2);
        cost.put(Arrays.asList(0, 3), 5);
        cost.put(Arrays.asList(1, 6), 1);
        cost.put(Arrays.asList(3, 1), 5);
        cost.put(Arrays.asList(3, 6), 6);
        cost.put(Arrays.asList(3, 4), 2);
        cost.put(Arrays.asList(2, 1), 4);
        cost.put(Arrays.asList(4, 2), 4);
        cost.put(Arrays.asList(4, 5), 3);
        cost.put(Arrays.asList(5, 2), 6);
        cost.put(Arrays.asList(5, 6), 3);
        cost.put(Arrays.asList(6, 4), 7);
    }

    // Uniform Cost Search algoritması implementasyonu
    static List<Integer> uniformCostSearch(List<Integer> goal, int start) {
        // Hedef düğüme olan minimum maliyeti tutacak liste
        List<Integer> answer = new ArrayList<>();
        // Başlangıçta tüm hedef düğümler için maliyeti maksimum olarak ayarla
        for (int i = 0; i < goal.size(); i++) {
            answer.add(Integer.MAX_VALUE);
        }

        // Düğümleri keşfetmek için kullanılacak öncelik sırası (maliyete göre)
        PriorityQueue<Tuple<Integer, Integer>> queue = new PriorityQueue<>();
        // Başlangıç düğümünü sıraya ekle
        queue.add(new Tuple<>(0, start));

        // Ziyaret edilen düğümleri takip etmek için kullanılan küme
        Set<Integer> visited = new HashSet<>();

        // Sıra boşalana kadar devam et
        while (!queue.isEmpty()) {
            // En düşük maliyetli düğümü sıradan al
            Tuple<Integer, Integer> current = queue.poll();
            int currentCost = current.x; // Şu anki düğümün maliyeti
            int currentNode = current.y; // Şu anki düğüm

            // Eğer düğüm daha önce ziyaret edildi ise devam et
            if (visited.contains(currentNode)) {
                continue;
            }

            // Düğümü ziyaret edildi olarak işaretle
            visited.add(currentNode);

            // Eğer hedef düğüme ulaşıldıysa
            if (goal.contains(currentNode)) {
                // Hedef düğümün indeksini bul
                int index = goal.indexOf(currentNode);
                // Mevcut maliyet ile daha önce hesaplanan maliyetten küçük olanı al
                answer.set(index, Math.min(answer.get(index), currentCost));

                // Eğer tüm hedef düğümler için bir maliyet hesaplandıysa sonucu döndür
                if (answer.stream().allMatch(c -> c != Integer.MAX_VALUE)) {
                    return answer;
                }
            }

            // Şu anki düğümün komşularını dolaş
            for (int neighbor : graph.get(currentNode)) {
                // Komşuya olan maliyeti hesapla
                int newCost = currentCost + cost.getOrDefault(Arrays.asList(currentNode, neighbor), 0);
                // Komşuyu ve maliyetini sıraya ekle
                queue.add(new Tuple<>(newCost, neighbor));
            }
        }

        // Hedef düğüme ulaşılamadıysa boş liste döndür
        return answer;
    }

    // Maliyet ve düğüm bilgisini saklamak için Tuple sınıfı
    static class Tuple<X extends Comparable<X>, Y> implements Comparable<Tuple<X, Y>> {
        public final X x; // Maliyet
        public final Y y; // Düğüm

        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        // Tuple'ları karşılaştırmak için kullanılan metod (maliyete göre)
        @Override
        public int compareTo(Tuple<X, Y> other) {
            return this.x.compareTo(other.x);
        }
    }
}