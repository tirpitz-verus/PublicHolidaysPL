package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class CorpusChristi extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        int year = date.get(GregorianCalendar.YEAR);
        boolean comunism = year <= 1993 && year >= 1945;
        GregorianCalendar easter60 = Easter.getEasterDayForYear(year);
        easter60.roll(GregorianCalendar.DAY_OF_YEAR, 60);
        if (date.equals(easter60) && !comunism) {
            return "Uroczystość Najświętszego Ciała i Krwi Pańskiej";
        } else {
            return next.getDescription(date);
        }
    }
}
