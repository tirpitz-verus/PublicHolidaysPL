package publicholidayspl;

import org.junit.Test;
import static org.junit.Assert.*;

public class CLICheckerTest {

    @Test
    public void checkNoArgs() {
        //given
        String [] args = new String[]{};
        
        //then
        assertFalse(CLIChecker.checkCLI(args));
    }
    
    @Test
    public void checkTooManyArgs() {
        //given
        String [] args = new String[]{"d", "d"};
        
        //then
        assertFalse(CLIChecker.checkCLI(args));
    }
    
    @Test
    public void checkBadDate() {
        //given
        String [] args = new String[]{"d"};
        
        //then
        assertFalse(CLIChecker.checkCLI(args));
    }
    
    @Test
    public void checkGoodDate() {
        //given
        String [] args = new String[]{"2013-10-28"};
        
        //then
        assertTrue(CLIChecker.checkCLI(args));
    }
}
