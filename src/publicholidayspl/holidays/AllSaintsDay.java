package publicholidayspl.holidays;

import java.util.GregorianCalendar;

public class AllSaintsDay extends Holiday {

    @Override
    public String getDescription(GregorianCalendar date) {
        boolean first = date.get(GregorianCalendar.DAY_OF_MONTH) == 1;
        boolean november = date.get(GregorianCalendar.MONTH) == GregorianCalendar.NOVEMBER;
        boolean comunism = date.get(GregorianCalendar.YEAR) > 1946 && date.get(GregorianCalendar.YEAR) < 1989;
        boolean startDate = date.get(GregorianCalendar.YEAR) >= 966;
        if (startDate && first && november) {
            String name;
            if (comunism) {
                name = "Święto Zmarłych";
            } else {
                name = "Uroczystość Wszystkich Świętych";
            }
            return String.format("1 listopada%s%s", delimiter, name);
        } else {
            return next.getDescription(date);
        }
    }
    
}
