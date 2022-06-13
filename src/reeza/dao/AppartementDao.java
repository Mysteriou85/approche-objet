package reeza.dao;

import reeza.ressource.Appartement;

import java.util.ArrayList;
import java.util.List;

public class AppartementDao {

    private List<Appartement> appartements = new ArrayList<>();

    public void ajouter(Appartement appartement) {
        appartements.add(appartement);
    }

    public  void supprimer(Appartement appartement) {
        appartements.remove(appartement);
    }

    public List<Appartement> lister() {
        return appartements;
    }

}
