package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class Saturday extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean year = date.get(GregorianCalendar.YEAR) > 2000;
        boolean day = date.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY;
        if (year && day) {
            return "sobota";
        } else {
            return next.getDescription(date);
        }
    }
}
