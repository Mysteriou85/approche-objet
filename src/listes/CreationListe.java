package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer myList = iterator.next();
            System.out.println(myList);
        }

    }

}
