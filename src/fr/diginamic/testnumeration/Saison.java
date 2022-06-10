package fr.diginamic.testnumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String nom;
    private int numero;

    private Saison(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static Saison saisonLibelle(String libelle) {
        Saison saison = null;
        for (Saison value : values()) {
            if(value.nom.equals(libelle)) {
                saison = value;
                break;
            }
        }
        return saison;
    }
}
