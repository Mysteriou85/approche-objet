package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/project/Projet IntelliJ IDEA/approche-objet/src/fichier/recensement.csv");
        Path newPath = Paths.get("D:/project/Projet IntelliJ IDEA/approche-objet/src/fichier/newRecensement.csv");
        Path sortie = Paths.get("D:/project/Projet IntelliJ IDEA/approche-objet/src/fichier/Recensement(Ville25000).csv");
        Files.deleteIfExists(sortie);
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        boolean estLisible = Files.isReadable(path);

        System.out.println(estLisible);

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        // System.out.println(lines);
        // String chaine = lines.toString();
        // String[] token = chaine.split(";");
        // System.out.println(token);

        // Files.copy(path, newPath);

        Integer nombreHabitant;

        List<String> outputLines = new ArrayList<>();

        for (String line : lines) {
            String[] value = line.split(";");
            value[7] = value[7].trim().replaceAll(" ", "");
            if (lines.indexOf(line) !=0) {
                nombreHabitant = Integer.parseInt(value[7]);
                String codeDepartement = value[2];
                String nomVille = value[6];

                if (nombreHabitant > 25000) {
                    // System.out.println("Ville : " + value[6] + " Population : " + value[7]);
                    outputLines.add(nomVille + ";" + codeDepartement + ";" + nombreHabitant);
                }
            }
        }
        Files.write(sortie, outputLines);

    }

}
