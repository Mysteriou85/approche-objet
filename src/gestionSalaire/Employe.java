package gestionSalaire;

import gestionSalaire.coordonnee.Adresse;
import gestionSalaire.coordonnee.CoordoContactPersonnel;
import gestionSalaire.coordonnee.CoordoContactProfessionnel;

public class Employe implements Personne {

    @Override
    public String nom() {
        return "joe";
    }

    @Override
    public String prenom() {
        return "joe";
    }

    @Override
    public String numeroSecurite() {
        return "0101010101";
    }

    @Override
    public Adresse adresse(int numeroRue, String nomRue, String codePostal, String ville) {
        return adresse(numeroRue, nomRue, codePostal, ville);
    }

    @Override
    public CoordoContactPersonnel coordoContactPersonnel(String numeroTelephonePerso, String mailPerso) {
        return coordoContactPersonnel(numeroTelephonePerso, mailPerso);
    }

    @Override
    public CoordoContactProfessionnel coordoCOntactProfessionnel(String numeroTelephonePro, String mailPro, String service, String adresseEntreprise) {
        return coordoCOntactProfessionnel(numeroTelephonePro, mailPro, service, adresseEntreprise);
    }

}
