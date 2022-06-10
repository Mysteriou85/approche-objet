package fr.diginamic.equals;

import listes2.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestEquals {

    public static void main(String[] args) {
//        List<Ville> listeVilles = new ArrayList<>(List.of(new Ville[] {
//                new Ville("Nice", 343000),
//                new Ville("Carcassonne", 47800),
//                new Ville("A", 500000),
//                new Ville("Z", 420590),
//                new Ville("meme", 10),
//                new Ville("meme", 10)
//        }));

        Ville ville1 = new Ville("meme", 10);
        Ville ville2 = new Ville("meme", 10);
        Ville ville3 = new Ville("test", 10);

        boolean result1 = ville1.equals(ville2);
        System.out.println(result1);
        boolean result3 = ville1.equals(ville3);
        System.out.println(result3);
        boolean result2 = ville1 == ville2;
        System.out.println(result2);

        Ville ville4 = ville1;
        boolean result4 = ville1 == ville4;
        System.out.println(result4);

    }
}
