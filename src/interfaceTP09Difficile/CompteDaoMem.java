package interfaceTP09Difficile;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;
import java.util.List;

public class CompteDaoMem implements CompteDao {

    List<Compte> comptes = new ArrayList<>();

    @Override
    public List<Compte> lister() {
//        for (Compte compte : comptes) {
//            System.out.println("Numero:" + compte.getNumeroCompte() + " | Solde:" + compte.getSoldeCompte());
//        }
        return comptes;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        comptes.add(nvCompte);
    }
    @Override
    public boolean supprimer(String numeroCompte) {
        boolean suppressionReussie = false;
        suppressionReussie = comptes.remove(numeroCompte);
        return suppressionReussie;
    }
    @Override
    public boolean existe(String numeroCompte) {
        return false;
    }
    @Override
    public Compte getCompte(String numeroCompte) {
        return comptes.get(0);
    }

}
