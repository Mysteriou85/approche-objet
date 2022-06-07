package interfaceTP09Difficile;

import fr.diginamic.banque.entites.Compte;

import java.util.List;

public interface CompteDao {

    List<Compte> lister();

    void sauvegarder(Compte nvCompte);

    boolean supprimer(String numeroCompte);

    boolean existe(String numeroCompte);

    Compte getCompte(String numeroCompte);

}
