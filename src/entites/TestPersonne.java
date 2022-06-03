package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne personne1 = new Personne("Jaque", "coco");
        // personne1.nom = "Jaque";
        // personne1.prenom = "Coco";

        Personne personne2 = new Personne("Pierre", "Jop", new AdressePostale(12, "rue des Roses", 85400, "Test"));
        // personne2.nom = "Pierre";
        // personne2.prenom = "Job";

        personne1.setPrenom("jean");
    }

}
