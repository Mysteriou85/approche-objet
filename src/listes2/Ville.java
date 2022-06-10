package listes2;

import java.util.ArrayList;
import java.util.Objects;

public class Ville {
//    public class Ville implements Comparable<listes2.Ville> {

    public String nom;
    public long nbHabitants;

    public Ville(String nom, long nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

//    @Override
//    public int compareTo(Ville o) {
//        if (this.nom.charAt(0) > o.getNom().charAt(0)) {
//            return 1;
//        }
//        if (this.nom.charAt(0) < o.getNom().charAt(0)) {
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return "Ville{" + "nom='" + nom + '\'' + ", nbHabitants=" + nbHabitants + '}';
    }

    public String getNom() {
        return nom;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbHabitants == ville.nbHabitants && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }
}
