package dnekh.telegabot.enums;

/**
 * Enum representing fractions of a work shift.
 */
public enum WorkShiftFraction {

    WHOLEDAY(1.0),
    UPTOFIVE(0.9),
    UPTOTHREE(0.6),
    UPTOTWELVE(0.4);

    private final double fraction;

    WorkShiftFraction(double fraction) {
        this.fraction = fraction;
    }

    /**
     * Gets the numerical value of the work shift fraction.
     *
     * @return the fraction value.
     */
    public double getFraction() {
        return fraction;
    }
}
