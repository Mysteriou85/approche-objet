package reeza.ressource;

public interface Reservable {

    boolean getReserve();

    int getPersonneMax();

    void reserver();

    void liberer();

}
