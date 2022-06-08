package gestionSalaire;

import gestionSalaire.coordonnee.Adresse;
import gestionSalaire.coordonnee.CoordoContactPersonnel;
import gestionSalaire.coordonnee.CoordoContactProfessionnel;

public class Employe implements Personne {

    String nom;
    String prenom;
    String numeroSecurite;
    Adresse adresse;
    CoordoContactPersonnel coordoperso;
    CoordoContactProfessionnel coordopro;

    @Override
    public String nom() {
        return nom;
    }

    @Override
    public String prenom() {
        return prenom;
    }

    @Override
    public String numeroSecurite() {
        return numeroSecurite;
    }

    @Override
    public Adresse adresse(int numeroRue, String nomRue, String codePostal, String ville) {
        return adresse;
    }

    @Override
    public CoordoContactPersonnel coordoContactPersonnel(String numeroTelephonePerso, String mailPerso) {
        return coordoperso;
    }

    @Override
    public CoordoContactProfessionnel coordoCOntactProfessionnel(String numeroTelephonePro, String mailPro, String service, String adresseEntreprise) {
        return coordopro;
    }

    public Employe(String nom, String prenom, String numeroSecurite, Adresse adresse, CoordoContactPersonnel coordoperso, CoordoContactProfessionnel coordopro) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSecurite = numeroSecurite;
        this.adresse = adresse;
        this.coordoperso = coordoperso;
        this.coordopro = coordopro;
    }
}
