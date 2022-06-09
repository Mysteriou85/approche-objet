package tri;

import listes2.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    @Override
    public int compare(Ville v1, Ville v2) {
        if (v1.getNom().charAt(0) > v2.getNom().charAt(0)) {
            return 1;
        }
        if (v1.getNom().charAt(0) < v2.getNom().charAt(0)) {
            return -1;
        }
        return 0;
    }

}
