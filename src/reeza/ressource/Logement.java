package reeza.ressource;

public abstract class Logement implements Reservable {

    int prixLocation;
    String adresseAppartement;
    int personneMax;
    boolean reserve;

    public Logement(int prixLocation, String adresseAppartement, int personneMax) {
        this.prixLocation = prixLocation;
        this.adresseAppartement = adresseAppartement;
        this.personneMax = personneMax;
        this.reserve = false;
    }

    @Override
    public void reserver() {
        setReserve(true);
    }

    @Override
    public void liberer() {
        setReserve(false);
    }

    @Override
    public String toString() {
        return "Logement{" +
                "prixLocation=" + prixLocation +
                ", adresseAppartement='" + adresseAppartement + '\'' +
                ", personneMax=" + personneMax +
                ", reserve=" + reserve +
                '}';
    }

    // GETTER
    public int getPrixLocation() {
        return prixLocation;
    }

    public String getAdresseAppartement() {
        return adresseAppartement;
    }

    public int getPersonneMax() {
        return personneMax;
    }

    public boolean getReserve() {
        return reserve;
    }

    // SETTER
    public void setPrixLocation(int prixLocation) {
        this.prixLocation = prixLocation;
    }

    public void setAdresseAppartement(String adresseAppartement) {
        this.adresseAppartement = adresseAppartement;
    }

    public void setPersonneMax(int personneMax) {
        this.personneMax = personneMax;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }
}
