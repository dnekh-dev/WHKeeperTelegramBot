package dnekh.telegabot.model;

import dnekh.telegabot.handlers.UserHandler;

/**
 * Represents a user in the system.
 */
public class User {
    private final TelegramId userTelegramId;
    private String name;
    private String email;

    /**
     * Constructs a new User with the specified details.
     *
     * @param userTelegramId the unique Telegram ID of the user (cannot be changed once set)
     * @param name the name of the user
     * @param email the email of the user
     */
    public User(TelegramId userTelegramId, String name, String email) {
        this.userTelegramId = userTelegramId;
        this.setName(name);
        this.setEmail(email);
    }

    /**
     * Returns the unique Telegram ID of the user.
     *
     * @return the Telegram ID
     */
    public TelegramId getTelegramId() {
        return userTelegramId;
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
     * Sets the name of the user.
     * This method validates the name before setting it.
     *
     * @param name the new name of the user
     * @throws IllegalArgumentException if the name is invalid
     */
    protected void setName(String name) {
        if (UserHandler.validateName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name. Name must contain only Latin letters.");
        }
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
     * Sets the email of the user.
     * This method validates the email before setting it.
     *
     * @param email the new email of the user
     * @throws IllegalArgumentException if the email is invalid
     */
    protected void setEmail(String email) {
        if (UserHandler.validateEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email. Email must be in a standard format.");
        }
    }
}
