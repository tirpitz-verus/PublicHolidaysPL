package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class FirstOfMayTest extends TestHoliday {
    
    public FirstOfMayTest() {
        super(new FirstOfMay());
    }

    @Test
    public void itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-05-01");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-12-05");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
    @Test
    public void tooEarly() {
        //given
        GregorianCalendar calendar = DateConverter.convert("1900-05-01");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
    
}
