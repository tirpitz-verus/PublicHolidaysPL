package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class IndependenceDay extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        if (comunism(date)) {
            return String.format("22 lipca%sNarodowe \u015awi\u0119to Odrodzenia Polski", delimiter);
        }
        boolean day = date.get(GregorianCalendar.DAY_OF_MONTH) == 11;
        boolean month = date.get(GregorianCalendar.MONTH) == GregorianCalendar.NOVEMBER;
        int year = date.get(GregorianCalendar.YEAR);
        boolean start = year > 1936;
        boolean war = year >= 1939 && year <= 1945;
        if (day && month && start && !war) {
            return "11 listopada" + delimiter + "Narodowe Święto Niepodległości";
        } else {
            return next.getDescription(date);
        }
    }

    private boolean comunism(GregorianCalendar date) {
        int year = date.get(GregorianCalendar.YEAR);
        boolean day = date.get(GregorianCalendar.DAY_OF_MONTH) == 22;
        boolean month = date.get(GregorianCalendar.MONTH) == GregorianCalendar.JULY;
        return year >= 1945 && year <= 1990 && day && month;
    }
}
