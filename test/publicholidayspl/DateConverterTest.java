package publicholidayspl;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tirpitz
 */
public class DateConverterTest {
    
    @Test
    public void testSomeMethod() {
        //given
        String input = "2013-10-28";
        
        //when
        GregorianCalendar calendar = DateConverter.convert(input);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String actual = dateFormat.format(calendar.getTime());
        
        //then
        assertEquals(input, actual);
    }
    
}
