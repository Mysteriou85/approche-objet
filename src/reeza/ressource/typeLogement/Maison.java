package reeza.ressource.typeLogement;

import reeza.ressource.Logement;

public class Maison extends Logement {

    boolean jardin;

    public Maison(int prixLocation, String adresseAppartement, int personneMax, boolean jardin) {
        super(prixLocation, adresseAppartement, personneMax);
        this.jardin = jardin;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "jardin=" + jardin +
                '}' + super.toString();
    }
}
