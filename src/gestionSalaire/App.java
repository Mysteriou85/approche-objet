package gestionSalaire;

import gestionSalaire.coordonnee.Adresse;
import gestionSalaire.coordonnee.CoordoContactPersonnel;
import gestionSalaire.coordonnee.CoordoContactProfessionnel;

public class App {

    public static void main(String[] args) {

        Adresse adresse1 = new Adresse(1, "rue Brute", "44500", "Nantes");
        CoordoContactPersonnel coordoperso1 = new CoordoContactPersonnel("02", "mail@perso");
        CoordoContactProfessionnel coordopro1 = new CoordoContactProfessionnel("06", "mail@pro", "Cadre", "2 rue George");
        Employe employe1 = new Employe("Jaque", "Coco", "01050606", adresse1, coordoperso1, coordopro1);





    }

}
