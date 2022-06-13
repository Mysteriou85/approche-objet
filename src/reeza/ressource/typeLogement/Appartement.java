package reeza.ressource.typeLogement;

import reeza.ressource.Logement;

public class Appartement extends Logement {

    private String etage;

    // CONSTRUCTOR
    public Appartement(int prixLocation, String adresseAppartement, int personneMax, String etage) {
        super(prixLocation, adresseAppartement, personneMax);
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "etage='" + etage + '\'' +
                '}' + super.toString();
    }
}
