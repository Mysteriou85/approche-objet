package fr.diginamic.banque.entites;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte1 = new Compte("0001", 15);
        CompteTaux compteTaux1 = new CompteTaux("0002", 101, 2.1);

        Compte[] comptes = new Compte[2];
        comptes[0] = compte1;
        comptes[1] = compteTaux1;

        // System.out.println(compte1);
        System.out.println(compteTaux1);
    }

}
