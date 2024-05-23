package dnekh.telegabot.model;

/**
 * The Note class represents a work note with the number of hours worked and the day of the note.
 */
public class Note {

    private static final int MAX_HOURS = 9;
    private int hoursWorked;
    private final String day;

    /**
     * Constructor with hoursWorked.
     *
     * @param hoursWorked the number of hours worked. Must be between 1 and 9 inclusive.
     */
    public Note(int hoursWorked) {
        setHoursWorked(hoursWorked);
        this.day = new Day().getCurrentDate();
    }

    /**
     * Gets the number of hours worked.
     *
     * @return the number of hours worked.
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets the number of hours worked.
     *
     * @param hoursWorked the new number of hours worked. Must be between 1 and 9 inclusive.
     */
    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked > 0 && hoursWorked <= MAX_HOURS) {
            this.hoursWorked = hoursWorked;
        } else {
            throw new IllegalArgumentException("Check entered value: hoursWorked must be between 1 and " + MAX_HOURS);
        }
    }

    /**
     * Gets the day of the note.
     *
     * @return the day of the note.
     */
    public String getDay() {
        return day;
    }
}
