package fr.diginamic.banque.entites;

public class Compte {

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }

    int numeroCompte;
    int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

}
