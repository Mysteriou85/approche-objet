package reeza.ressource;

public class Appartement {

    int prixLocation;
    String adresseAppartement;
    int personneMax;
    String etage;
    boolean reserve;

    public Appartement(int prixLocation, String adresseAppartement, int personneMax, String etage, boolean reserve) {
        this.prixLocation = prixLocation;
        this.adresseAppartement = adresseAppartement;
        this.personneMax = personneMax;
        this.etage = etage;
        this.reserve = reserve;
    }

    public int getPrixLocation() {
        return prixLocation;
    }

    public String getadresseAppartement() {
        return adresseAppartement;
    }

    public int getPersonneMax() {
        return personneMax;
    }

    public String getEtage() {
        return etage;
    }

    public boolean getReserve() {
        return reserve;
    }

    public void setPrixLocation(int prixLocation) {
        this.prixLocation = prixLocation;
    }

    public void setadresseAppartement(String adresseAppartement) {
        this.adresseAppartement = adresseAppartement;
    }

    public void setPersonneMax(int personneMax) {
        this.personneMax = personneMax;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }
}
