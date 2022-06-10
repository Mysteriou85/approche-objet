package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        SimpleDateFormat test1 = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
        //System.out.println(test1.format(new Date()));

        String chaine1 = test1.format(date1);
        System.out.println(chaine1);


        Date date2 = new Date("05/19/2016 23:59:30");
        //System.out.println(date2);

        SimpleDateFormat test2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
        //System.out.println(test2.format(new Date()));

        String chaine2 = test2.format(date2);
        System.out.println(chaine2);
    }


}
