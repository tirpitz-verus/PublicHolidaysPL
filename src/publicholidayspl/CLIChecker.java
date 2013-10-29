package publicholidayspl;

import java.util.regex.Pattern;

/**
 * Klasa sprawdza poprawność argumentów wejściowych.
 *
 * @author tirpitz
 */
public class CLIChecker {

    /**
     * Funkcja przyjmuje tablicę argumentów. Jeżeli argumenty są poprawne, to
     * zwraca {@code true}. Jeżeli nie, to zwraca {@code false} i wypisuje
     * informację o błędzie.
     */
    public static boolean checkCLI(String[] args) {
        boolean badArgsNumber = args.length != 1;
        if(badArgsNumber) {
            System.out.println(String.format("B\u0141\u0104D: z\u0142a ilo\u015bc argument\u00f3w, powinien by\u0107 1 a by\u0142o %s", args.length));
            return false;
        }
        boolean badDateFormat = Pattern.matches("\\d{4}(-\\d{2}){2}", args[0]) == false;
        if(badDateFormat) {
            System.out.println("B\u0141\u0104D: format daty nie jest zgodny z yyyy-mm-dd");
            return false;
        }
        return true;
    }
}
