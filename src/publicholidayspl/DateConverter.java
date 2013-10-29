package publicholidayspl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Klasa do konwertowania czasu.
 */
public class DateConverter {
      
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public static GregorianCalendar convert(String dateToConvert){  
        Date date;
        try {
            date = dateFormat.parse(dateToConvert);
        } catch (ParseException ex) {
            System.out.println("nie można skonwertować " +dateToConvert +" do daty");
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(GregorianCalendar.MONDAY);
        return calendar;
    }
}
