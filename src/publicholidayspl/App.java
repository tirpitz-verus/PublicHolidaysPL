package publicholidayspl;

import java.text.ParseException;
import publicholidayspl.holidays.Checker;
import static publicholidayspl.DateConverter.convert;

/**
 * Główna klasa programu.
 */
public class App {

    public static void main(String[] args) throws ParseException {
        boolean dontRunApp = CLIChecker.checkCLI(args) == false;
        if (dontRunApp) {
            return;
        }
        
        Checker checker = Checker.getChecker(convert(args[0]));
        if (checker.isAHoliday()) {
            System.out.println(String.format("zadana data %s to dzie\u0144 wolny od pracy", args[0]));
            System.out.println(checker.getDescription());
        } else {
            System.out.println(String.format("zadana data %s to dzie\u0144 pracujący", args[0]));
        }
    }
}
