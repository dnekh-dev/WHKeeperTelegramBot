package dnekh.telegabot.enums;

public enum WorkShiftFraction {

    WHOLEDAY("1.0"),
    UPTOFIVE("0.9"),
    UPTOTHREE("0.6"),
    UPTOTWELVE("0.4");

    private final String description;

    WorkShiftFraction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
