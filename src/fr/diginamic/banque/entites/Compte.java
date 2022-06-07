package fr.diginamic.banque.entites;

public class Compte {

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte = " + numeroCompte +
                ", soldeCompte = " + soldeCompte +
                '}';
    }

    String numeroCompte;
    int soldeCompte;

    public Compte(String numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

}
