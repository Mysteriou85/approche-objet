package listes2;

import java.util.ArrayList;

public class Ville implements Comparable<Ville> {

    public String nom;
    public long nbHabitants;

    public Ville(String nom, long nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }


    @Override
    public int compareTo(Ville ville) {
        if (ville.nbHabitants == this.nbHabitants) return 0;
        if (ville.nbHabitants > this.nbHabitants) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Ville{" + "nom='" + nom + '\'' + ", nbHabitants=" + nbHabitants + '}';
    }

    public static void main(String[] args) {

    }

    public String getNom() {
        return nom;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }
}
