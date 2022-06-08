package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");


        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.println("--- Key ---");
        Iterator<Integer> key = mapVilles.keySet().iterator();
        while (key.hasNext()) {
            Integer test = key.next();
            System.out.println(test);
        }

        System.out.println("--- Value ---");
        Iterator<String> value = mapVilles.values().iterator();
        while (value.hasNext()) {
            String test = value.next();
            System.out.println(test);
        }

        System.out.println("Map size : " + mapVilles.size());
    }

}
