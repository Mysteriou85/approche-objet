package listes2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

    public static void main(String[] args) {
        List<String> listVille = new ArrayList<>();
        listVille.add("Nice");
        listVille.add("Carcassonne");
        listVille.add("Narbonne");
        listVille.add("Lyon");
        listVille.add("Foix");
        listVille.add("Pau");
        listVille.add("Marseille");
        listVille.add("Tarbes");

        Integer length = null;
        for (String s : listVille) {
            if (length == null) {
                length = s.length();
            } else if (length < s.length()) {
                length = s.length();
            }
            s = s.toUpperCase();
            System.out.println(s);
        }

        // System.out.println(length);
        System.out.println("--- Ville avec le nom le plus long ---");
        for (String s : listVille) {
            if (length == s.length()) {
                System.out.println(s);
            }
        }

        System.out.println("--- Liste ville qui ne commence pas par 'N' ---");
        Iterator<String> iterator = listVille.iterator();
        while (iterator.hasNext()) {
            String test = iterator.next();
            if (test.charAt(0) == 'N') {
                iterator.remove();
            }
            System.out.println(test.charAt(0));
            System.out.println(test);
        }


    }

}
