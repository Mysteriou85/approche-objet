package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);

        System.out.println("map 3 : " + map3);

        HashMap<Integer, String> map4 = new HashMap<>();
        for (Integer key : map1.keySet()) {
            map4.put(key, map1.get(key));
        }

        for (Integer key : map2.keySet()) {
            map4.put(key, map2.get(key));
        }
        System.out.println("map 4 (for) : " + map4);

    }

}
