package fr.diginamic.testnumeration;

public enum Continent {

    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    OCEANIE("Océanie");

    private String libelle;
    Continent(String libelle) {

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public static Continent fromLibelle(String libelle) {
        Continent continent = null;
        for (Continent value : values()) {
            if(value.libelle.equals(libelle)) {
                continent = value;
                break;
            }
        }
        return continent;
    }
}
