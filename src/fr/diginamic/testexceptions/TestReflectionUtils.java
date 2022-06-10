package fr.diginamic.testexceptions;

import fr.diginamic.testnumeration.Continent;
import fr.diginamic.testnumeration.Pays;

import javax.management.ReflectionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {

//        List<Ville> villeList = new ArrayList<>();
//        Collections.addAll(villeList,
//                new Ville("Nante", 1000),
//                new Ville("Paris", 1000),
//                new Ville("Brem-sur-mer", 1000)
//        );
        Ville paris = new Ville("Paris", 10000);
        Ville nante = new Ville("Nante", 60000);
        Ville bremSurMer = new Ville("Brem-sur-mer", 500);

        try {
            ReflectionUtils.afficherAttributs(paris);
            ReflectionUtils.afficherAttributs(null);
        } catch (Exception e) {
            throw new ReflectionException(e, "kétafait");
        }



    }
}
