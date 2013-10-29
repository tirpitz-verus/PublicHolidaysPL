package publicholidayspl.holidays;

import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import publicholidayspl.DateConverter;

public class FirstOfJanuaryTest extends TestHoliday {

    public FirstOfJanuaryTest() {
        super(new FirstOfJanuary());
    }

    @Test
    public void itsMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-01-01");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertFalse(badDate);
    }
    
    @Test
    public void itsNotMe() {
        //given
        GregorianCalendar calendar = DateConverter.convert("2013-01-02");

        //when
        String actual = objectUnderTest.getDescription(calendar);

        //then
        boolean badDate = actual.equals(NoHoliday.NO_HOLIDAY);
        assertTrue(badDate);
    }
}
