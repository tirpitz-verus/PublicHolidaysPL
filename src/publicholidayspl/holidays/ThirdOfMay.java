package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import static publicholidayspl.holidays.Holiday.delimiter;

public class ThirdOfMay extends Holiday {

    private final GregorianCalendar startingDate = new GregorianCalendar(1791, 0, 1);

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean first = date.get(GregorianCalendar.DAY_OF_MONTH) == 3;
        boolean may = date.get(GregorianCalendar.MONTH) == GregorianCalendar.MAY;
        boolean afterStartingDate = date.after(startingDate);
        if (first && may && afterStartingDate) {
            return String.format("3 maja%s\u015awi\u0119to Narodowe Trzeciego Maja - rocznica uchwalenia Konstytucji w 1791", delimiter);
        } else {
            return next.getDescription(date);
        }
    }
}
