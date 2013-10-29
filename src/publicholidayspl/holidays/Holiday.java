package publicholidayspl.holidays;

import java.util.GregorianCalendar;

/**
 * Abstrakcyjna klasa świąt.
 */
public abstract class Holiday {
    
    public static final String delimiter = " -> ";
    
    protected Holiday next;

    public void setNext(Holiday holiday) {
        if (next == null) {
            this.next = holiday;
        } else {
            next.setNext(holiday);
        }
    }
    
    /**
     * Funkcja zwraca opis święta.
     */
    public abstract String getDescription(GregorianCalendar date);
}
