package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class SixthOfJanuary extends Holiday {

    private final GregorianCalendar startingDate = new GregorianCalendar(2011, 0, 1);
    
    @Override
    public String getDescription(GregorianCalendar date) {
        boolean afterStartingDate = date.after(startingDate);
        boolean sixth = date.get(GregorianCalendar.DAY_OF_YEAR) == 6;
        if (afterStartingDate && sixth) {
            return String.format("6 stycznia%s\u015awi\u0119to Trzech Kr\u00f3li", delimiter);
        } else {
            return next.getDescription(date);
        }
    }
    
}
