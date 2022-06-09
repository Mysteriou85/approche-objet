package tri;

import listes2.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville v1, Ville v2) {
        if (v1.getNbHabitants() > v2.getNbHabitants()) {
            return 1;
        }
        if (v1.getNbHabitants() < v2.getNbHabitants()) {
            return -1;
        }
        return 0;
    }

}
