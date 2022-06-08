package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

    public static void main(String[] args) {

        HashSet<String> listVille = new HashSet<>();
        listVille.add("USA");
        listVille.add("France");
        listVille.add("Allemagne");
        listVille.add("UK");
        listVille.add("Italie");
        listVille.add("Japon");
        listVille.add("Chine");
        listVille.add("Russie");
        listVille.add("Inde");

        Integer length = null;
        for (String s : listVille) {
            if (length == null) {
                length = s.length();
            } else if (length < s.length()) {
                length = s.length();
            }
            System.out.println(s);
        }

        // System.out.println(length);
        System.out.println("--- Ville avec le nom le plus long ---");
        for (String s : listVille) {
            if (length == s.length()) {
                System.out.println(s);
            }
        }


        Iterator<String> iterator = listVille.iterator();
        while (iterator.hasNext()) {
            String test = iterator.next();
            if (test.length() == length) {
                iterator.remove();
            }
        }

        System.out.println("--- Liste ville sans le plus long ---");
//        for (String s : listVille) {
//            System.out.println(s);
//        }

        System.out.println(listVille);

    }

}
