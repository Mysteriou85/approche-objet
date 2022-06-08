package listes2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {
        List<Integer> listEntier = new ArrayList<>();
        listEntier.add(-1);
        listEntier.add(5);
        listEntier.add(7);
        listEntier.add(3);
        listEntier.add(-2);
        listEntier.add(4);
        listEntier.add(8);
        listEntier.add(5);

        int lengthListeEntier = 0;
        Integer elementMax = null;
        Integer elementMin = null;

        System.out.println("Afficher la liste : ");
        Iterator<Integer> iteratorListeEntier = listEntier.iterator();
        while (iteratorListeEntier.hasNext()) {
            Integer test = iteratorListeEntier.next();
            System.out.println(test);
            lengthListeEntier++;

            if (elementMax == null || elementMin == null) {
                elementMax = test;
                elementMin = test;
            }
            if (elementMax < test) {
                elementMax = test;
            }
            if (elementMin > test) {
                elementMin = test;
            }

        }

        System.out.println("Longueur liste entier : " + lengthListeEntier);
        System.out.println("Element le plus grand : " + elementMax);
        System.out.println("Element le plus petit : " + elementMin);

        Iterator<Integer> iteratorSupprMin = listEntier.iterator();
        while (iteratorSupprMin.hasNext()) {
            Integer test = iteratorSupprMin.next();
            if (elementMin == test) {
                iteratorSupprMin.remove();
            }
        }

        // l'on doit créé une nouvelle liste
        List<Integer> listEntierEdit = new ArrayList<>();
        Iterator<Integer> iteratorChangeNeg = listEntier.iterator();
        while (iteratorChangeNeg.hasNext()) {
            Integer test = iteratorChangeNeg.next();
            if (test < 0) {
                test *= -1;
                listEntierEdit.add(test);
            } else {
                listEntierEdit.add(test);
            }
        }

        System.out.println("Liste finale");
        Iterator<Integer> iteratorAffiche = listEntierEdit.iterator();
        while (iteratorAffiche.hasNext()) {
            Integer test = iteratorAffiche.next();
            System.out.println(test);
        }

    }

}
