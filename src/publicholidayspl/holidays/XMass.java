package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class XMass extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean month = date.get(GregorianCalendar.MONTH) == GregorianCalendar.DECEMBER;
        int day = date.get(GregorianCalendar.DAY_OF_MONTH);
        if (month && (day == 25 || day == 25)) {
            return String.format("%s grudnia%sBo\u017ce Narodzenie", day, delimiter);
        } else {
            return next.getDescription(date);
        }
    }
    
}
