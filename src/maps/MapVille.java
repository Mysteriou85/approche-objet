package maps;

import listes2.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapVille {

    public static void main(String[] args) {

        List<Ville> listeVilles = new ArrayList<>(List.of(new Ville[] {
               new Ville("Nice", 343000),
               new Ville("Carcassonne", 47800)
        }));

        Map<String, Ville> mapVilles = new HashMap<>();

        for(Ville ville : listeVilles) {
            mapVilles.put(ville.getNom(), ville);
        }
        System.out.println(mapVilles);

        String cleVilleLaMoijnsPeuplee = null;
        for (String key : mapVilles.keySet()) {
            Ville value = mapVilles.get(key);
            if (cleVilleLaMoijnsPeuplee == null || mapVilles.get(cleVilleLaMoijnsPeuplee).getNbHabitants() > value.getNbHabitants()) {
                cleVilleLaMoijnsPeuplee = key;
            }
        }
        System.out.println("ville la moins peuplée : " + cleVilleLaMoijnsPeuplee);
        mapVilles.remove(cleVilleLaMoijnsPeuplee);
        System.out.println(mapVilles);


    }

}
