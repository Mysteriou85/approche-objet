package utils;

public class TestDe {
    public static void main(String[] args) {
        De testDe = new De(10);
        //System.out.println(testDe.getResultat());
        int countSix = 0;
        int countTest = 0;
        int objectif = 100;
        int nombreVoulu = 6;
        do {
            // System.out.printf("testDe : %d ", testDe.getResultat());
            if (testDe.getResultat() == nombreVoulu) {
                countSix++;
            }
            countTest++;
        } while (countSix < objectif);
        System.out.printf("Nous avons obtenu %d fois le nombre de %d en %d coups", objectif, nombreVoulu, countTest);

    }
}
