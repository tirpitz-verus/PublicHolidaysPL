package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class EasterTest extends TestHoliday {
    
    public EasterTest() {
        super(new Easter());
    }

    @Test
    public void itsMe1st() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2001-04-15");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDay);                
    }
    
    @Test
    public void itsMe2nd() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2001-04-16");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDay);                
    }
    
    @Test
    public void itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2001-03-15");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDay);                
    }
    
    @Test
    public void getEasterDayForYear_2009() {
        //given
        int year = 2009;
        
        //when
        GregorianCalendar actual = Easter.getEasterDayForYear(year);
        
        //then
        assertEquals(12, actual.get(GregorianCalendar.DAY_OF_MONTH));
        assertEquals(GregorianCalendar.APRIL, actual.get(GregorianCalendar.MONTH));
    }
    
    @Test
    public void getEasterDayForYear_1980() {
        //given
        int year = 1980;
        
        //when
        GregorianCalendar actual = Easter.getEasterDayForYear(year);
        
        //then
        assertEquals(6, actual.get(GregorianCalendar.DAY_OF_MONTH));
        assertEquals(GregorianCalendar.APRIL, actual.get(GregorianCalendar.MONTH));
    }
    
    @Test
    public void getEasterDayForYear_2026() {
        //given
        int year = 2026;
        
        //when
        GregorianCalendar actual = Easter.getEasterDayForYear(year);
        
        //then
        assertEquals(5, actual.get(GregorianCalendar.DAY_OF_MONTH));
        assertEquals(GregorianCalendar.APRIL, actual.get(GregorianCalendar.MONTH));
    }
    
    @Test
    public void getEasterDayForYear_2008() {
        //given
        int year = 2008;
        
        //when
        GregorianCalendar actual = Easter.getEasterDayForYear(year);
        
        //then
        assertEquals(23, actual.get(GregorianCalendar.DAY_OF_MONTH));
        assertEquals(GregorianCalendar.MARCH, actual.get(GregorianCalendar.MONTH));
    }
    
}
