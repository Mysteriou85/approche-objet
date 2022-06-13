package reeza.services;

import reeza.dao.AppartementDao;
import reeza.exception.AppartDejaReserveBusinessException;
import reeza.exception.SurcapaciteBusinessException;
import reeza.ressource.Appartement;

import java.util.ArrayList;
import java.util.List;

public class ReserveAppart {

    private AppartementDao appartementDao;

    public ReserveAppart(AppartementDao appartementDao) {
        setAppartementDao(appartementDao);
    }

    public void reserver(Appartement appartement, int nombrePersonne) throws AppartDejaReserveBusinessException, SurcapaciteBusinessException {
        if (appartement.getReserve()) {
            throw new AppartDejaReserveBusinessException("L'appartement " + appartement + " est déjà reservé");
        }
        if (nombrePersonne > appartement.getPersonneMax()) {
            throw new SurcapaciteBusinessException("L'appartement + " + appartement + " n'as pas assez de place");
        }
        appartement.setReserve(true);
    }

    public void liberer(Appartement appartement) {
        appartement.setReserve(false);
    }

    public List<Appartement> listerAppartementDisponibles() {
        List<Appartement> appartementsDisponibles = new ArrayList<>();
        for (Appartement appartement : appartementDao.lister()) {
            if(!appartement.getReserve()) {
                appartementsDisponibles.add(appartement);
            }
        }
        return appartementsDisponibles;
    }

    public List<Appartement> listerAppartementNonDisponibles() {
        List<Appartement> appartementsNonDisponibles = new ArrayList<>();
        for (Appartement appartement : appartementDao.lister()) {
            if(appartement.getReserve()) {
                appartementsNonDisponibles.add(appartement);
            }
        }
        return appartementsNonDisponibles;
    }

    public void setAppartementDao(AppartementDao appartementDao) {
        this.appartementDao = appartementDao;
    }
}
