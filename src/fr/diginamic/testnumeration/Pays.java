package fr.diginamic.testnumeration;

public class Pays {

    String nom;
    long nbHabitants;
    long PIBHabitants;

    Continent continent;

    public Pays(String nom, int nbHabitants, int PIBHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.PIBHabitants = PIBHabitants;
        this.continent = continent;
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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setPIBHabitants(long PIBHabitants) {
        this.PIBHabitants = PIBHabitants;
    }
}
