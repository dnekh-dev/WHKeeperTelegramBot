package dnekh.telegabot.model;

/**
 * Represents the settings for a user in the system.
 */
public class Settings {

    private int baseDailyWage;
    private final User user;

    /**
     * Constructs a new Settings object with the specified user and base daily wage.
     *
     * @param user          the user associated with these settings
     * @param baseDailyWage the base daily wage for the user
     */
    public Settings(User user, int baseDailyWage) {
        this.user = user;
        this.baseDailyWage = baseDailyWage;
    }

    /**
     * Returns the base daily wage for the user.
     *
     * @return the base daily wage
     */
    public int getBaseDailyWage() {
        return baseDailyWage;
    }

    /**
     * Sets the base daily wage for the user.
     *
     * @param baseDailyWage the new base daily wage
     */
    public void setBaseDailyWage(int baseDailyWage) {
        this.baseDailyWage = baseDailyWage;
    }

    /**
     * Returns the name of the user.
     *
     * @return the user's name
     */
    public String getUserName() {
        return user.getName();
    }

    /**
     * Sets the name of the user.
     *
     * @param name the new name of the user
     */
    public void setUserName(String name) {
        user.setName(name);
    }

    /**
     * Returns the email of the user.
     *
     * @return the user's email
     */
    public String getUserEmail() {
        return user.getEmail();
    }

    /**
     * Sets the email of the user.
     *
     * @param email the new email of the user
     */
    public void setUserEmail(String email) {
        user.setEmail(email);
    }

    /**
     * Returns the unique Telegram ID of the user.
     *
     * @return the user's Telegram ID
     */
    public String getUserTelegramId() {
        return user.getTelegramId();
    }

    /**
     * Returns the user associated with these settings.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }
}
