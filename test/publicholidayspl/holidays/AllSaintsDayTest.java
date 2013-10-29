package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class AllSaintsDayTest extends TestHoliday {
    
    public AllSaintsDayTest() {
        super(new AllSaintsDay());
    }

    @Test
    public void itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-11-01");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDay);
    }
    
    @Test
    public void itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-11-02");
        
        //when
        String actual = objectUnderTest.getDescription(calendar);
        
        //then
        boolean badDay = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDay);
    }
    
}
