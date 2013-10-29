package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class AssumptionOfMaryTest extends TestHoliday {
    
    public AssumptionOfMaryTest() {
        super(new AssumptionOfMary());
    }

    @Test
    public void itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-08-15");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void tooEarly() {
        //given
        GregorianCalendar calendar = DateConverter.convert("600-08-15");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
    @Test
    public void comunism() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1970-08-15");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
}
