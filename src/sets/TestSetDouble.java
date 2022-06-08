package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

    public static void main(String[] args) {

        HashSet<Double> hashDouble = new HashSet<>();
        hashDouble.add(1.5d);
        hashDouble.add(8.25d);
        hashDouble.add(-7.32d);
        hashDouble.add(13.3d);
        hashDouble.add(12.45d);
        hashDouble.add(48.5d);
        hashDouble.add(0.01d);

        Double elementMax = null;
        Double elementMin = null;

        System.out.println("Afficher la liste : ");
        Iterator<Double> iteratorListeEntier = hashDouble.iterator();
        while (iteratorListeEntier.hasNext()) {
            Double test = iteratorListeEntier.next();
            System.out.println(test);

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

        System.out.println("Element le plus grand : " + elementMax);
        System.out.println("Element le plus petit : " + elementMin);


        Iterator<Double> iteratorSupprMin = hashDouble.iterator();
        while (iteratorSupprMin.hasNext()) {
            Double test = iteratorSupprMin.next();
            if (elementMin == test) {
                iteratorSupprMin.remove();
            }
        }

        System.out.println("--- list - plus petit ---");
        Iterator<Double> iteratorFinal = hashDouble.iterator();
        while (iteratorFinal.hasNext()) {
            Double test = iteratorFinal.next();
            System.out.println(test);
        }

    }

}
