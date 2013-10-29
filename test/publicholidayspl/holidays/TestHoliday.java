package publicholidayspl.holidays;

/**
 * Abstrakcyjna klasa testów;
 */
public abstract class TestHoliday {

    protected final Holiday objectUnderTest;

    public TestHoliday(Holiday holiday) {
        objectUnderTest = holiday;
        objectUnderTest.next = new NoHoliday();
    }
}
