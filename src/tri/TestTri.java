package tri;

import listes2.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {

    public static void main(String[] args) {
        List<Ville> listeVilles = new ArrayList<>(List.of(new Ville[] {
                new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("A", 500000),
                new Ville("Z", 420590),
                new Ville("C", 999999)
        }));

        System.out.println(listeVilles);
        Collections.sort(listeVilles);
        System.out.println(listeVilles);

    }

}
