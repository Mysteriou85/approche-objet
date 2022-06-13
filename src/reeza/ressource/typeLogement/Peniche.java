package reeza.ressource.typeLogement;

import reeza.ressource.Logement;

public class Peniche extends Logement {

    double longueurPeniche;

    // CONSTRUCTOR
    public Peniche(int prixLocation, String adresseAppartement, int personneMax, double longueurPeniche) {
        super(prixLocation, adresseAppartement, personneMax);
        this.longueurPeniche = longueurPeniche;
    }

    // GETTER
    public double getLongueurPeniche() {
        return longueurPeniche;
    }

    // SETTER
    public void setLongueurPeniche(double longueurPeniche) {
        this.longueurPeniche = longueurPeniche;
    }

    @Override
    public String toString() {
        return "Peniche{" +
                "longueurPeniche=" + longueurPeniche +
                '}' + super.toString();
    }
}
