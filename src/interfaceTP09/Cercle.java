package interfaceTP09;

public class Cercle implements ObjetGeometrique {

    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * rayon * Math.PI;
    }
    @Override
    public double surface() {
        return (2 * rayon) * Math.PI;
    }


}
