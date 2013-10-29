package publicholidayspl.holidays;

import java.util.GregorianCalendar;

/**
 * Klasa sprawdza, czy zadana data jest świętem.
 */
public class Checker {
    
    private final GregorianCalendar date;
    private String holidayDescription = "";
    private Holiday firstHoliday;
    
    private Checker(GregorianCalendar dateToCheck) {
        date = dateToCheck;
    }
    
    /**
     * Funkcja zwraca "sprawdzacz" dla zadanej daty.
     */
    public static Checker getChecker(GregorianCalendar dateToCheck) {
        return new Checker(dateToCheck).initChain();
    }

    /**
     * Metoda inicjalizuje łańcuch świąt.
     */
    private Checker initChain() {
        firstHoliday = new AllSaintsDay();
        firstHoliday.setNext(new ArmedForcesDay());
        firstHoliday.setNext(new AssumptionOfMary());
        firstHoliday.setNext(new CorpusChristi());
        firstHoliday.setNext(new Easter());
        firstHoliday.setNext(new FirstOfJanuary());
        firstHoliday.setNext(new FirstOfMay());
        firstHoliday.setNext(new IndependenceDay());
        firstHoliday.setNext(new Saturday());
        firstHoliday.setNext(new SixthOfJanuary());
        firstHoliday.setNext(new Sunday());
        firstHoliday.setNext(new ThirdOfMay());
        firstHoliday.setNext(new XMass());
        firstHoliday.setNext(new NoHoliday());
        return this;
    }

    /**
     * Metoda sprawdza, czy data jest świętem, na podstawie łańcucha świąt. Jeżeli data jest świętem, to zostanie ustawione pole {@code holidayDescription}.
     */
    public boolean isAHoliday() {
        String result = firstHoliday.getDescription(date);
        if (result == NoHoliday.NO_HOLIDAY) {
            return false;
        } else {
            holidayDescription = result;
            return true;
        }
    }

    public String getDescription() {
        return holidayDescription;
    }
}
