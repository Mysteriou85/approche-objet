package sets;

import java.util.HashSet;

public class TestSetObjet {

    public static void main(String[] args) {
        HashSet<Pays> listPays = new HashSet<>();
        listPays.add(new Pays ("USA", 329500000, 1));
        listPays.add(new Pays ("France", 67390000, 2));
        listPays.add(new Pays ("Allemagne", 8324000, 3));
        listPays.add(new Pays ("UK", 67220000, 4));
        listPays.add(new Pays ("Italie", 59550000, 5));
        listPays.add(new Pays ("Japon", 125800000, 6));
        listPays.add(new Pays ("Chine", 1402000000, 7));
        listPays.add(new Pays ("Russie", 144100000, 8));
        listPays.add(new Pays ("Inde", 1380000000, 9));


        Pays paysAvecPibTotalMax = null;
        for (Pays pays : listPays) {
            if (paysAvecPibTotalMax == null || (pays.calculerPibTotal() > paysAvecPibTotalMax.calculerPibTotal())) {
                paysAvecPibTotalMax = pays;
            }
        }
        System.out.println(paysAvecPibTotalMax.nom);
    }
}
