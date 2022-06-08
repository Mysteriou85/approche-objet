package sets;

public class Pays {

    String nom;
    long nbHabitants;
    long PIBHabitants;

    public Pays(String nom, int nbHabitants, int PIBHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.PIBHabitants = PIBHabitants;
    }

    public long calculerPibTotal() {
        return getNbHabitants() * getPIBHabitants();
    }

    public String getNom() {
        return nom;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }

    public long getPIBHabitants() {
        return PIBHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setPIBHabitants(long PIBHabitants) {
        this.PIBHabitants = PIBHabitants;
    }
}
