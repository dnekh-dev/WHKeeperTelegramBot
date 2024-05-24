package dnekh.telegabot.handlers;

import dnekh.telegabot.model.Settings;
import dnekh.telegabot.model.Note;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for converting hours worked into daily earnings.
 */
public class HoursConverter {

    private static final Map<Integer, Double> workShiftFractionMap = new HashMap<>();

    //TODO review the coefficient determination system (and rewrite this initial block?)
    static {
        workShiftFractionMap.put(9, 1.0);
        workShiftFractionMap.put(8, 0.9);
        workShiftFractionMap.put(6, 0.6);
        workShiftFractionMap.put(4, 0.4);
    }

    /**
     * Calculates the total earnings for the day based on settings and note.
     *
     * @param settings the settings object containing the wage information.
     * @param note     the note object containing the hours worked information.
     * @return the total earnings for the day.
     */
    public static double calculateTotalForThisDay(Settings settings, Note note) {
        if (settings == null || note == null) {
            throw new IllegalArgumentException("Settings and Note must not be null");
        }

        int baseDailyWage = settings.getBaseDailyWage();
        int hoursWorked = note.getHoursWorked();

        Double fraction = workShiftFractionMap.get(hoursWorked);

        if (fraction == null) {
            throw new IllegalArgumentException("Invalid hoursWorked value: " + hoursWorked);
        }

        return baseDailyWage * fraction;
    }
}
