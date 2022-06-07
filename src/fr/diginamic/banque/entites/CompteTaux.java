package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double remuneration;

    public CompteTaux(String numeroCompte, int soldeCompte, double remuneration) {
        super(numeroCompte, soldeCompte);

    }

    public String toString() {
        return super.toString() + "\n\tCompteTaux{" +
                "remuneration = " + remuneration +
                '}';
    }



}
