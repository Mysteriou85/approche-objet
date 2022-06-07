package fr.diginamic.banque.entites;

import interfaceTP09Difficile.CompteDao;
import interfaceTP09Difficile.CompteDaoMem;

import java.util.Scanner;

public class TestBanque {

    static CompteDaoMem compteDaoMem = new CompteDaoMem();

    public static void main(String[] args) {

        Compte compte1 = new Compte("0001", 15);
        CompteTaux compteTaux1 = new CompteTaux("0002", 101, 2.1);

        compteDaoMem.sauvegarder(compte1);
        compteDaoMem.sauvegarder(compteTaux1);

        // System.out.println(compte1);
        // System.out.println(compteTaux1);

        Scanner scanner = new Scanner(System.in);

        boolean test = true;

        do {
            System.out.println(
                    "***** Administration des comptes ***** \n" +
                            "1. Lister les comptes \n" +
                            "2. Ajouter un nouveau compte \n" +
                            "3. Ajouter une opération à un compte\n" +
                            "4. Supprimer un compte\n" +
                            "99. Sortir \n"
            );
            int selectChoix = scanner.nextInt();

            switch (selectChoix) {
                case 1:
                    System.out.println("--- Liste des comptes ---");
                    // compteDaoMem.lister();
                    for(Compte compte : compteDaoMem.lister()) {
                        System.out.println("Numero:" + compte.getNumeroCompte() + " | Solde:" + compte.getSoldeCompte());
                    }
                    break;
                case 2:
                    System.out.println("--- Ajout d’un nouveau compte ---");
                    System.out.println("Numero du nouveau compte : ");
                    String numeroAdd = scanner.next();

                    System.out.println("Solde du nouveau compte : ");
                    int soldeCompteAdd = scanner.nextInt();

                    System.out.println("Type du nouveau compte : \n(1 - Normal, 2 - Remunere) ");
                    selectChoix = scanner.nextInt();

                    switch (selectChoix) {
                        case 1:
                            Compte newCompte = new Compte(numeroAdd, soldeCompteAdd);
                            compteDaoMem.sauvegarder(newCompte);
                            break;
                        case 2:
                            System.out.println("Taux du nouveau compte : ");
                            double tauxNouveauCompte = scanner.nextDouble();

                            CompteTaux newCompteTaux = new CompteTaux(numeroAdd, soldeCompteAdd, tauxNouveauCompte);
                            compteDaoMem.sauvegarder(newCompteTaux);
                            break;
                        default:
                            System.err.println("Error");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("--- Ajout d’une opération à un compte ---");
                    int choixOperation = scanner.nextInt();
                    if (choixOperation == 1) {

                    } else if ( choixOperation == 2 ) {

                    }
                    break;
                case 4:
                    System.out.println("--- Suppression d’un compte ---");
                    System.out.println("Designé le numéro du compte à supprimer");
                    String choixSuppression = scanner.next();
                    compteDaoMem.supprimer(choixSuppression);
                    break;
                case 99:
                    System.out.println("--- Au revoir ---");
                    test = false;
                    break;
                default:
                    System.err.println("--- Error ---");
            }

        } while (test == true);

    }
}
