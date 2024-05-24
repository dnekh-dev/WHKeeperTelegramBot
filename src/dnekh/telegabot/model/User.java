package dnekh.telegabot.model;

/**
 * Represents a user in the system.
 */
public class User {

    private final String telegramId;
    private String name;
    private String email;

    /**
     * Constructs a new User with the specified details.
     *
     * @param telegramId the unique Telegram ID of the user (cannot be changed once set)
     * @param name       the name of the user
     * @param email      the email of the user
     */
    public User(String telegramId, String name, String email) {
        this.telegramId = telegramId;
        this.name = name;
        this.email = email;
    }

    /**
     * Returns the unique Telegram ID of the user.
     *
     * @return the Telegram ID
     */
    public String getTelegramId() {
        return telegramId;
    }

    /**
     * Returns the name of the user.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email of the user.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the name of the user.
     * This method is protected and can be accessed only within the package or subclasses.
     *
     * @param name the new name of the user
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the email of the user.
     * This method is protected and can be accessed only within the package or subclasses.
     *
     * @param email the new email of the user
     */
    protected void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }
}
