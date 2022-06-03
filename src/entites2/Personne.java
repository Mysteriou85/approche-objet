package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void nomPrenomEnMajuscule(String nom, String prenom) {
        System.out.println(nom.toUpperCase());
        System.out.println(prenom.toUpperCase());
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        System.out.println("prenom actuel : " + this.prenom);
        this.prenom = prenom;
        System.out.println("nouveau prenom : " + this.prenom);
    }

    public void setAdresse(AdressePostale adresse) {
        System.out.println("Adresse actuel : " + this.adressePostale);
        this.adressePostale = adresse;
        System.out.println("nouvelle adresse : " + this.adressePostale);
    }

}


