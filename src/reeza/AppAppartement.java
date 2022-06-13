package reeza;

import java.util.Scanner;

public class AppAppartement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String filePath = ClassLoader.getSystemClassLoader().getResource("Appart.csv").getFile();

        int choix = 0;
        do {
            afficherMenuAppart();

            String choixMenu = scanner.nextLine();

            choix = Integer.parseInt(choixMenu);

            switch (choix) {
                case 1:
                    break;
                case 2:
                    break;
            }
        } while (choix != 9);

    }

    private static void afficherMenuAppart() {
        System.out.println("--- Réservation d'un appartement ---");
        System.out.println("1.");
        System.out.println("9. Sortir");
    }
}
