package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class AssumptionOfMary extends Holiday {

    final private GregorianCalendar startDate = new GregorianCalendar(700, 0, 1);
    final private GregorianCalendar stopDate = new GregorianCalendar(1961, 0, 1);
    final private GregorianCalendar secondStartDate = new GregorianCalendar(1989, 0, 1);
    
    @Override
    public String getDescription(GregorianCalendar date) {
        boolean comunistStop = date.after(stopDate) && date.before(secondStartDate);
        boolean afterStartDate = date.after(startDate) && !comunistStop;
        boolean august = date.get(GregorianCalendar.MONTH) == GregorianCalendar.AUGUST;
        boolean fiveteenth = date.get(GregorianCalendar.DAY_OF_MONTH) == 15;
        if (afterStartDate && august && fiveteenth) {
            return String.format("15 sierpnia%sWniebowzi\u0119cie Naj\u015bwi\u0119tszej Maryi Panny", delimiter);
        } else {
            return next.getDescription(date);
        }
    }
    
}
