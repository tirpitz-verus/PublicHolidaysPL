package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class Easter extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        int year = date.get(GregorianCalendar.YEAR);
        GregorianCalendar firstDayForThisYear = getEasterDayForYear(year);
        boolean firstDay = date.equals(firstDayForThisYear);
        GregorianCalendar secondDayForThisYear = getEasterDayForYear(year);
        secondDayForThisYear.roll(GregorianCalendar.DAY_OF_MONTH, true);
        boolean secondDay = date.equals(secondDayForThisYear);
        boolean concordat = year >= 1993;
        if ((firstDay || secondDay) && concordat) {
            String name;
            if (secondDay) {
                name = "Drugi";
            } else {
                name = "Pierwszy";
            }
            return name +" Dzień Wielkiej Nocy";
        } else {
            return next.getDescription(date);
        }
    }
    
    public static GregorianCalendar getEasterDayForYear(int year){
        int a = year % 19;                          //Dzielimy liczbę roku na 19 i wyznaczamy resztę a.
        int b = year / 100;                         //Dzielimy liczbę roku przez 100, wynik zaokrąglamy w dół (odcinamy część ułamkową) i otrzymujemy liczbę b.
        int c = year % 100;                         //Dzielimy liczbę roku przez 100 i otrzymujemy resztę c.
        int d = b / 4;                              //Liczymy: b : 4 i wynik zaokrąglamy w dół i otrzymujemy liczbę d.
        int e = b % 4;                              //Liczymy: b : 4 i wyznaczamy resztę e.
        int f = (b + 8) / 25;                       //Liczymy: (b + 8) : 25 i wynik zaokrąglamy w dół i otrzymujemy liczbę f.
        int g = (b - f + 1) / 3;                    //Liczymy: (b – f + 1) : 3 i wynik zaokrąglamy w dół i otrzymujemy liczbę g.
        int h = (19 * a + b - d - g + 15) % 30;     //Liczymy: (19 x a + b – d – g + 15) : 30 i wyznaczamy resztę h.
        int i = c / 4;                              //Liczymy: c : 4 i wynik zaokrąglamy w dół i otrzymujemy cyfrę i.
        int k = c % 4;                              //Liczymy: c : 4 i wyznaczamy resztę k.
        int l = (32 + 2 * e + 2 * i - h - k) % 7;   //Liczymy: (32 + 2 x e + 2 x i – h – k) : 7 i otrzymujemy resztę l.
        int m = (a + 11 * h + 22 * l) / 451;        //Liczymy: (a + 11 x h + 22 x l) : 451 i wynik zaokrąglamy w dół i otrzymujemy liczbę m.
        int p = (h + l - 7 * m + 114) % 31;         //Liczymy: (h + l – 7 x m + 114) : 31 i otrzymujemy resztę p.
        int day = p + 1;                            //Dzień Wielkanocy = p + 1.
        int month = (h + l - 7 * m + 114) / 31 - 1; //Miesiąc = Zaokrąglenie w dół dzielenia (h + l – 7 x m + 114) przez 31.
        return new GregorianCalendar(year, month, day);
    }
    
}
