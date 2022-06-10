package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, Calendar.MAY, 19, 22, 58, 29);

        Date cal1 = calendar1.getTime();
        //System.out.println(calendar1);

        SimpleDateFormat test1 = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(test1.format(new Date()));

        String chaine1 = test1.format(cal1);
        System.out.println(chaine1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.getTime();

        //System.out.println(calendar2);
        Date cal2 = calendar2.getTime();

        SimpleDateFormat test2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaine2 = test2.format(cal2);
        System.out.println(chaine2);

        SimpleDateFormat sdfFr = new SimpleDateFormat("EEEEE MMMMM", Locale.FRANCE);
        SimpleDateFormat sdfUk = new SimpleDateFormat("EEEEE MMMMM", Locale.UK);
        SimpleDateFormat sdfJpn = new SimpleDateFormat("EEEEE MMMMM", Locale.JAPAN);

        System.out.println(sdfFr.format(cal1.getTime()));
        System.out.println(sdfUk.format(cal1.getTime()));
        System.out.println(sdfJpn.format(cal1.getTime()));
    }

}
