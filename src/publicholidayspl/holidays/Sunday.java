package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class Sunday extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean sunday = date.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SUNDAY;
        if (sunday) {
            return "niedziela";
        } else {
            return next.getDescription(date);
        }
    }

}
