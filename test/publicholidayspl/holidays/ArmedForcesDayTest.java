package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;


public class ArmedForcesDayTest extends TestHoliday {
    
    public ArmedForcesDayTest() {
        super(new ArmedForcesDay());
    }

    @Test
    public void nowadays_itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-08-15");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void nowadays_itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-07-15");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
    @Test
    public void postComunism_itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1990-05-03");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void postComunism_itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1990-05-02");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
    @Test
    public void comunism_itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1960-10-12");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void comunism_itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1960-10-13");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
    @Test
    public void preWar_itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1930-08-15");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void preWar_itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1930-08-16");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
}
