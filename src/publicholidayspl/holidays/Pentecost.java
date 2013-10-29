package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class Pentecost extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        int year = date.get(GregorianCalendar.YEAR);
        boolean comunism = year <= 1993 && year >= 1945;
        GregorianCalendar easter50 = Easter.getEasterDayForYear(year);
        easter50.roll(GregorianCalendar.DAY_OF_YEAR, 50);
        if (date.equals(easter50) && !comunism) {
            return "Zesłanie Ducha Świętego";
        } else {
            return next.getDescription(date);
        }
    }

}
