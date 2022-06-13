package reeza;

import reeza.dao.AppartementDao;
import reeza.exception.AppartDejaReserveBusinessException;
import reeza.exception.SurcapaciteBusinessException;
import reeza.ressource.Appartement;
import reeza.services.ReserveAppart;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppAppartement {

    static AppartementDao appartementDao;
    static ReserveAppart reserveAppart;

    public static void main(String[] args) throws IOException, AppartDejaReserveBusinessException, SurcapaciteBusinessException {

        appartementDao = new AppartementDao();
        reserveAppart = new ReserveAppart(appartementDao);

        initData();

        List<Appartement> appartements = appartementDao.lister();
        System.out.println(appartements);

        reserveAppart.reserver(appartements.get(0), 1);

        try {
            reserveAppart.reserver(appartements.get(0), 1);
        } catch (AppartDejaReserveBusinessException e) {
            System.out.println("Appartement déjà reservé");
        }

        reserveAppart.liberer(appartements.get(0));
        reserveAppart.reserver(appartements.get(0), 1);

        System.out.printf("L'appartement est disponible : %s\n", reserveAppart.listerAppartementDisponibles());
        System.out.printf("L'appartement est non disponible : %s\n", reserveAppart.listerAppartementNonDisponibles());

        try {
            reserveAppart.reserver(appartements.get(2), appartements.get(2).getPersonneMax() + 1);
        } catch (SurcapaciteBusinessException e) {
            System.out.println("Appartement en surcapacité, test OK");
        }

    }

    private static void afficherMenuAppart() {
        System.out.println("--- Réservation d'un appartement ---");
        System.out.println("1. Afficher les appartements");
        System.out.println("2. Réserver un appartement");
        System.out.println("9. Sortir");
    }

    private static void initData() {
        appartementDao.ajouter(new Appartement(15, "2 rue George", 2, "RDC"));
        appartementDao.ajouter(new Appartement(10, "2 rue George", 4, "1"));
        appartementDao.ajouter(new Appartement(25, "2 rue George", 8, "2"));
    }
}
