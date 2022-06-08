package gestionSalaire;

import gestionSalaire.coordonnee.Adresse;
import gestionSalaire.coordonnee.CoordoContactPersonnel;
import gestionSalaire.coordonnee.CoordoContactProfessionnel;

public interface Personne {

    String nom();
    String prenom();
    String numeroSecurite();

    Adresse adresse(int numeroRue, String nomRue, String codePostal, String ville);

    CoordoContactPersonnel coordoContactPersonnel(String numeroTelephonePerso, String mailPerso);
    CoordoContactProfessionnel coordoCOntactProfessionnel(String numeroTelephonePro, String mailPro, String service, String adresseEntreprise);

}
