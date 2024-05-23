package dnekh.telegabot.model;

import java.time.LocalDate;

/**
 * The Day class provides the current date.
 */
public class Day {

    /**
     * Gets the current date as a string.
     *
     * @return the current date in the format YYYY-MM-DD.
     */
    public String getCurrentDate() {
        return LocalDate.now().toString();
    }
}
