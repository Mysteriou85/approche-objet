package interfaceTP09;

public class Cercle implements ObjetGeometrique {

    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() { return 2 * rayon * Math.PI; }
    public double surface() { return (2 * rayon) * Math.PI; }


}
