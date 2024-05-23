package dnekh.telegabot.model;

/**
 * The User class represents a user with personal information and settings.
 */
public class User {

    private final Settings settings;
    private Note note;

    /**
     * Constructor with settings and note.
     *
     * @param settings the settings associated with the user.
     * @param note     the note associated with the user.
     */
    public User(Settings settings, Note note) {
        this.settings = settings;
        this.note = note;
    }

    /**
     * Gets the username from settings.
     *
     * @return the username.
     */
    public String getUsername() {
        return settings.getUsername();
    }

    /**
     * Gets the name from settings.
     *
     * @return the name of the user.
     */
    public String getName() {
        return settings.getName();
    }

    /**
     * Gets the email from settings.
     *
     * @return the email of the user.
     */
    public String getEmail() {
        return settings.getEmail();
    }

    /**
     * Gets the base daily wage from settings.
     *
     * @return the base daily wage.
     */
    public int getBaseDailyWage() {
        return settings.getBaseDailyWage();
    }

    /**
     * Gets the note.
     *
     * @return the note associated with the user.
     */
    public Note getNote() {
        return note;
    }

    /**
     * Sets the note.
     *
     * @param note the new note associated with the user.
     */
    public void setNote(Note note) {
        this.note = note;
    }

    /**
     * Gets the settings.
     *
     * @return the settings.
     */
    public Settings getSettings() {
        return settings;
    }
}
