package fr.diginamic.testnumeration;

import java.util.*;

public class TestPaysAvecEnum {
    public static void main(String[] args) {

        List<Pays> paysList = new ArrayList<>();
        Collections.addAll(paysList,
                new Pays("Laroc", 1000, 1, Continent.AFRIQUE),
                new Pays("Gabon", 1000, 1, Continent.AFRIQUE),
                new Pays("Australie", 1000, 1, Continent.OCEANIE),
                new Pays("France", 1000, 1, Continent.EUROPE),
                new Pays("Pologne", 1000, 1, Continent.EUROPE),
                new Pays("Argentine", 1000, 1, Continent.AMERIQUE)
        );

        Map<Continent, Integer> paysParContinent = new HashMap<>();
        for (Continent continent : Continent.values()) {
            paysParContinent.put(continent, 0);
        }

        for (Pays pays : paysList) {
            int nbPays = paysParContinent.get(pays.getContinent()) + 1;
            paysParContinent.put(pays.getContinent(), nbPays);
        }


        System.out.println(paysParContinent);


    }
}
