package reeza;

import reeza.dao.LogementDao;
import reeza.exception.LogementDejaReserveBusinessException;
import reeza.exception.SurcapaciteBusinessException;
import reeza.ressource.Logement;
import reeza.ressource.typeLogement.Appartement;
import reeza.ressource.typeLogement.Maison;
import reeza.ressource.typeLogement.Peniche;
import reeza.services.ReserveService;

import java.io.IOException;
import java.util.List;

public class AppAppartement {

    static LogementDao logementDao;
    static ReserveService reserveService;

    public static void main(String[] args) throws IOException, LogementDejaReserveBusinessException, SurcapaciteBusinessException {

        logementDao = new LogementDao();
        reserveService = new ReserveService(logementDao);

        initData();

        List<Logement> appartements = logementDao.lister();
        System.out.println(appartements);

        reserveService.reserver(appartements.get(0), 1);

        try {
            reserveService.reserver(appartements.get(0), 1);
        } catch (LogementDejaReserveBusinessException e) {
            System.out.println("Appartement déjà reservé");
        }

        reserveService.liberer(appartements.get(0));
        reserveService.reserver(appartements.get(0), 1);

        System.out.printf("L'appartement est disponible : %s\n", reserveService.listerAppartementDisponibles());
        System.out.printf("L'appartement est non disponible : %s\n", reserveService.listerAppartementNonDisponibles());

        try {
            reserveService.reserver(appartements.get(2), appartements.get(2).getPersonneMax() + 1);
        } catch (SurcapaciteBusinessException e) {
            System.out.println("Appartement en surcapacité, test OK");
        }
    }

    private static void initData() {
        logementDao.ajouter(new Appartement(15, "2 rue George", 2, "RDC"));
        logementDao.ajouter(new Appartement(10, "2 rue George", 4, "1"));
        logementDao.ajouter(new Appartement(25, "2 rue George", 8, "2"));
        logementDao.ajouter(new Maison(15, "5 rue Lieux", 4, true));
        logementDao.ajouter(new Maison(25, "5 rue Ailleurs", 2, true));
        logementDao.ajouter(new Peniche(17, "2 rue Ici", 4, 15));
        logementDao.ajouter(new Peniche(18, "5 rue Là", 2, 25));
    }
}
