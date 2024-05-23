package dnekh.telegabot.model;

/**
 * The Settings class represents the settings associated with a user.
 */
public class Settings {

    private final String username;
    private String name;
    private String email;
    private int baseDailyWage;

    /**
     * Constructor with username, name, email, and baseDailyWage.
     *
     * @param username      the username associated with the settings.
     * @param name          the name associated with the settings.
     * @param email         the email associated with the settings.
     * @param baseDailyWage the base daily wage.
     */
    public Settings(String username, String name, String email, int baseDailyWage) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.baseDailyWage = baseDailyWage;
    }

    /**
     * Gets the username.
     *
     * @return the username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the name.
     *
     * @return the name associated with the settings.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name associated with the settings.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email.
     *
     * @return the email associated with the settings.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email associated with the settings.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the base daily wage.
     *
     * @return the base daily wage.
     */
    public int getBaseDailyWage() {
        return baseDailyWage;
    }

    /**
     * Sets the base daily wage.
     *
     * @param baseDailyWage the new base daily wage.
     */
    public void setBaseDailyWage(int baseDailyWage) {
        this.baseDailyWage = baseDailyWage;
    }
}
