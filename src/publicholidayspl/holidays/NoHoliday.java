package publicholidayspl.holidays;

import java.util.GregorianCalendar;

/**
 * Klasa braku święta.
 */
public class NoHoliday extends Holiday {

    public static final String NO_HOLIDAY = "NoHoliday";
    
    @Override
    public String getDescription(GregorianCalendar date) {
        return NO_HOLIDAY;
    }
    
}
