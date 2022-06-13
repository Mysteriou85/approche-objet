package reeza.services;

import reeza.dao.LogementDao;
import reeza.exception.LogementDejaReserveBusinessException;
import reeza.exception.SurcapaciteBusinessException;
import reeza.ressource.Reservable;

import java.util.ArrayList;
import java.util.List;

public class ReserveService {

    private Reservable reservable;
    private LogementDao logementDao;

    public ReserveService(LogementDao logementDao) {
        setLogementDao(logementDao);
    }

    public void reserver(Reservable reservable, int nombrePersonne) throws LogementDejaReserveBusinessException, SurcapaciteBusinessException {
        if (reservable.getReserve()) {
            throw new LogementDejaReserveBusinessException("L'objet " + reservable + " est déjà reservé");
        }
        if (nombrePersonne > reservable.getPersonneMax()) {
            throw new SurcapaciteBusinessException("L'objet + " + reservable + " n'as pas assez de place");
        }
        reservable.reserver();
    }

    public void liberer(Reservable reservable) {
        reservable.liberer();
    }

    public List<Reservable> listerAppartementDisponibles() {
        List<Reservable> reservableDisponibles = new ArrayList<>();
        for (Reservable reservable : logementDao.lister()) {
            if(!reservable.getReserve()) {
                reservableDisponibles.add(reservable);
            }
        }
        return reservableDisponibles;
    }

    public List<Reservable> listerAppartementNonDisponibles() {
        List<Reservable> reservableNonDisponibles = new ArrayList<>();
        for (Reservable reservable : logementDao.lister()) {
            if(reservable.getReserve()) {
                reservableNonDisponibles.add(reservable);
            }
        }
        return reservableNonDisponibles;
    }

    public void setLogementDao(LogementDao logementDao) {
        this.logementDao = logementDao;
    }
}