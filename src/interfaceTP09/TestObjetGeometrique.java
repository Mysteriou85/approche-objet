package interfaceTP09;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique objetGeometrique[] = new ObjetGeometrique[2];

        objetGeometrique[0] = new Cercle(2);
        objetGeometrique[1] = new Rectangle(5, 2);

        for (ObjetGeometrique geometrique : objetGeometrique) {
            System.out.println("Périmètre : " + geometrique.perimetre());
            System.out.println("Surface : " + geometrique.surface());
        }

    }

}
