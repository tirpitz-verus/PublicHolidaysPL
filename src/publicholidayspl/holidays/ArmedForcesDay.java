package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import static publicholidayspl.holidays.Holiday.delimiter;

public class ArmedForcesDay extends Holiday {

    final private GregorianCalendar startDate = new GregorianCalendar(1923, 0, 1);
    final private GregorianCalendar commieStartDate = new GregorianCalendar(1948, 0, 1);
    final private GregorianCalendar postCommieStart = new GregorianCalendar(1990, 0, 1);
    final private GregorianCalendar postCommieStop = new GregorianCalendar(1992, 7, 1);

    @Override
    public String getDescription(GregorianCalendar date) {
        if (isComunism(date)) {
            return String.format("12 padziernika%sDzie\u0144 Wojska Polskiego", delimiter);
        }
        if (isPostComunism(date)) {
            return String.format("3 maja%s\u015awi\u0119to Wojska Polskiego", delimiter);
        }
        if (nowadays(date)) {
            return String.format("15 pa\u017adziernika%s\u015awi\u0119to Wojska Polskiego", delimiter);
        }
        if (preWar(date)) {
            return String.format("15 sierpnia%sW\u015awi\u0119to \u017bo\u0142nierza", delimiter);
        } else {
            return next.getDescription(date);
        }
    }

    private boolean preWar(GregorianCalendar date) {
        boolean beforeComunism = date.after(startDate) && date.before(commieStartDate);
        boolean august = date.get(GregorianCalendar.MONTH) == GregorianCalendar.AUGUST;
        boolean fiveteenth = date.get(GregorianCalendar.DAY_OF_MONTH) == 15;
        return august && fiveteenth && beforeComunism;
    }

    private boolean nowadays(GregorianCalendar date) {
        boolean august = date.get(GregorianCalendar.MONTH) == GregorianCalendar.AUGUST;
        boolean fiveteenth = date.get(GregorianCalendar.DAY_OF_MONTH) == 15;
        return august && fiveteenth && date.after(postCommieStop);
    }

    private boolean isPostComunism(GregorianCalendar date) {
        boolean comunism = date.after(postCommieStart) && date.before(postCommieStop);
        boolean third = date.get(GregorianCalendar.DAY_OF_MONTH) == 3;
        boolean may = date.get(GregorianCalendar.MONTH) == GregorianCalendar.MAY;
        return comunism && third && may;
    }

    private boolean isComunism(GregorianCalendar date) {
        boolean comunism = date.after(commieStartDate) && date.before(postCommieStart);
        boolean twelve = date.get(GregorianCalendar.DAY_OF_MONTH) == 12;
        boolean october = date.get(GregorianCalendar.MONTH) == GregorianCalendar.OCTOBER;
        return comunism && twelve && october;
    }
}
