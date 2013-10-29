package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class FirstOfMay extends Holiday {
    
    private final GregorianCalendar startingDate = new GregorianCalendar(1950, 0, 1);

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean first = date.get(GregorianCalendar.DAY_OF_MONTH) == 1;
        boolean may = date.get(GregorianCalendar.MONTH) == GregorianCalendar.MAY;
        boolean afterStartingDate = date.after(startingDate);
        if (first && may && afterStartingDate) {
            return String.format("1 maja%s\u015awi\u0119to Pa\u0144stwowe", delimiter);
        } else {
            return next.getDescription(date);
        }
    }

}
