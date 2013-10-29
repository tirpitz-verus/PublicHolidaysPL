package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class IndependenceDayTest extends TestHoliday {
    
    public IndependenceDayTest() {
        super(new IndependenceDay());
    }

    @Test
    public void comunism_itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1960-07-22");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDay);
    }
    
    @Test
    public void comunism_itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1960-07-12");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDay);
    }
    
    @Test
    public void itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-11-11");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDay);
    }
    
    @Test
    public void itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-07-22");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDay);
    }
    
    @Test
    public void itsWar() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1943-11-11");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDay);
    }
}
