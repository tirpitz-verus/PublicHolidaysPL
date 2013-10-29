package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class FirstOfJanuary extends Holiday {
    
    @Override
    public String getDescription(GregorianCalendar date) {
        boolean itsMe = date.get(GregorianCalendar.DAY_OF_YEAR) == 1;
        if (itsMe){
            return String.format("1 stycznia%spierwszy dzie\u0144 roku", delimiter);
        } else {
            return next.getDescription(date);
        }
    }
    
}
