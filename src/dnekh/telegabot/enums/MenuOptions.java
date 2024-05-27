package dnekh.telegabot.enums;

/**
 * The MenuOptions enum represents the available menu options for the user.
 * Each option corresponds to a specific command that the user can enter.
 */
public enum MenuOptions {

    HELP("/help"),
    SETWAGE("/setWage"),
    SETNAME("/setName"),
    SETEMAIL("/setEmail"),  // Corrected typo from "/setEmail" to "/setEmail"
    GETSUMMARY("/getSummary");

    private final String description;

    /**
     * Constructs a MenuOptions enum with the specified description.
     *
     * @param description the description of the menu option
     */
    MenuOptions(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the menu option.
     *
     * @return the description of the menu option
     */
    public String getDescription() {
        return description;
    }
}
